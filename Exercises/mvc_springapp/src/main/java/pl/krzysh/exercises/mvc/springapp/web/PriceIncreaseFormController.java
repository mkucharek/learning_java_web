package pl.krzysh.exercises.mvc.springapp.web;

import javax.servlet.ServletException;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import pl.krzysh.exercises.mvc.springapp.service.PriceIncrease;
import pl.krzysh.exercises.mvc.springapp.service.PriceIncreaseValidator;
import pl.krzysh.exercises.mvc.springapp.service.ProductManager;


@Controller
public class PriceIncreaseFormController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private ProductManager productManager;
    
    @InitBinder
    protected void initBinder(WebDataBinder binder)
    {
    	binder.setValidator(new PriceIncreaseValidator());
    }

    @RequestMapping(value="/priceincrease.htm", method=RequestMethod.POST)
    public ModelAndView onSubmit(@Valid @ModelAttribute("priceIncrease") PriceIncrease priceIncrease)
            throws ServletException {

        int increase = priceIncrease.getPercentage();
        logger.info("Increasing prices by " + increase + "%.");

        productManager.increasePrice(increase);

        logger.info("returning from PriceIncreaseForm view to hello.htm");

        return new ModelAndView(new RedirectView("hello.htm"));
    }
    
    @RequestMapping(value="/priceincrease.htm", method=RequestMethod.GET)
    public ModelAndView onShowForm()
            throws ServletException {

    	ModelMap model = new ModelMap();
    	PriceIncrease priceIncrease = new PriceIncrease();
    	priceIncrease.setPercentage(20);
    	model.addAttribute("priceIncrease", priceIncrease);
    	
        return new ModelAndView("priceincrease", model);
    }

    public void setProductManager(ProductManager productManager) {
        this.productManager = productManager;
    }

    public ProductManager getProductManager() {
        return productManager;
    }

}
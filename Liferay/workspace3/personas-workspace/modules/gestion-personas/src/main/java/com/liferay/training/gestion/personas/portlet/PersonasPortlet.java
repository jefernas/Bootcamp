package com.liferay.training.gestion.personas.portlet;

import com.liferay.training.gestion.personas.constants.PersonasPortletKeys;
import com.liferay.training.personas.model.Personas;
import com.liferay.training.personas.service.PersonasLocalService;
import com.liferay.training.personas.service.PersonasLocalServiceUtil;


import java.io.IOException;
import java.util.Date;
import java.util.List;


import com.liferay.portal.kernel.dao.orm.QueryUtil;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.PortletDisplay;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author jefernas
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.training",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=false",
		"javax.portlet.display-name=Personas",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PersonasPortletKeys.PERSONAS,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class PersonasPortlet extends MVCPortlet {
	
    
    
    
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		
		
			// Call the service to get the persona
			List<Personas> personas;
			personas = PersonasLocalServiceUtil.getPersonases(QueryUtil.ALL_POS, QueryUtil.ALL_POS);
	
			// Set attributes to the request.
			renderRequest.setAttribute("personas", personas);
	
			// Set back icon visible.
			PortletDisplay portletDisplay = themeDisplay.getPortletDisplay();
			String redirect = renderRequest.getParameter("redirect");
			portletDisplay.setShowBackIcon(true);
			portletDisplay.setURLBack(redirect);
			
			
		super.render(renderRequest, renderResponse);
	}
	

	
	
	@Reference
	PersonasLocalService personasLocalService;
	

    
   
}
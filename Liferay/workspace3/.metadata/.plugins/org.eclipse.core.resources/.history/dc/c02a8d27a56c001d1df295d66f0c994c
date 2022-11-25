package com.liferay.training.gestion.personas.portlet.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.DateFormatFactoryUtil;
import com.liferay.portal.kernel.util.LocalizationUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.personas.exception.*;
import com.liferay.training.personas.model.Personas;
import com.liferay.training.personas.service.PersonasService;
import com.liferay.training.gestion.personas.constants.PersonasPortletKeys;
import com.liferay.training.gestion.personas.constants.MVCCommandNames;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
/**
 * MVC Action Command for adding assignments.
 *
 * @author liferay
 */
@Component(
 immediate = true,
 property = {
 "javax.portlet.name=" + PersonasPortletKeys.PERSONAS,
 "mvc.command.name=" + MVCCommandNames.ADD_PERSONAS
 },
 service = MVCActionCommand.class
)

public class AddPersonasMVCActionCommand extends BaseMVCActionCommand{

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {


		ThemeDisplay themeDisplay =
				 (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
				 ServiceContext serviceContext = ServiceContextFactory.getInstance(
				 Personas.class.getName(), actionRequest);
				 // Get parameters from the request.
				 String dni = ParamUtil.getString(actionRequest, "dni", StringPool.BLANK);
				 /* try {				 // Call the service to add a new assignment.

				_personasService.addPersonas(
				 themeDisplay.getScopeGroupId(), dni, description, dueDate, se sendRedirect(actionRequest, actionResponse);
				 }catch (Exception e) {

				 e.printStackTrace();
				 
				 }*/
				
				 
	
				 
		
	}
@Reference
protected PersonasService _personasService;

}

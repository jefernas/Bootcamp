package com.liferay.training.gestion.personas.portlet.action;

import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.training.gestion.personas.constants.MVCCommandNames;
import com.liferay.training.gestion.personas.constants.PersonasPortletKeys;
import com.liferay.training.personas.model.Personas;
import com.liferay.training.personas.service.PersonasService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
 immediate = true,
 property = {
 "javax.portlet.name=" + PersonasPortletKeys.PERSONAS,
 "mvc.command.name=" + MVCCommandNames.DELETE_PERSONAS
 },
 service = MVCActionCommand.class
)
public class deletePersonasMVCActionCommand extends BaseMVCActionCommand {

	@Reference
	protected PersonasService _personasService;
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		ThemeDisplay themeDisplay =
				 (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
				 ServiceContext serviceContext = ServiceContextFactory.getInstance(
				 Personas.class.getName(), actionRequest);
		
				 String dni = ParamUtil.getString(actionRequest, "dni", StringPool.BLANK);

				 try {
					 _personasService.deletePersonas(dni);
				 }catch (Exception e) {
					 e.printStackTrace();
				 }
	}

}

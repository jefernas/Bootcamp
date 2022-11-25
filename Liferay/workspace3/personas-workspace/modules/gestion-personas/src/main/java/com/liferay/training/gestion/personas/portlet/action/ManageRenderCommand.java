package com.liferay.training.gestion.personas.portlet.action;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.training.gestion.personas.constants.MVCCommandNames;
import com.liferay.training.gestion.personas.constants.PersonasPortletKeys;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "javax.portlet.name=" + PersonasPortletKeys.PERSONAS, "mvc.command.name=/personas/",
		"mvc.command.name=manage" }, service = MVCRenderCommand.class)
	

public class ManageRenderCommand implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		return "/personas/manage.jsp";
	}

}

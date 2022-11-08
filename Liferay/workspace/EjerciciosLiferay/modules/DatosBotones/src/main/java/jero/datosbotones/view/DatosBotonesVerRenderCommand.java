package jero.datosbotones.view;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

@Component(
		property = {
			"com.liferay.portlet.display-category=category.sample",
			"javax.portlet.display-name=DatosBotonesVerRenderCommand",
			"javax.portlet.init-param.view-template=/VerDatos.jsp"
			
		},
		service = Portlet.class
	)

public class DatosBotonesVerRenderCommand extends MVCPortlet {

	@Override
	public void render(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {

		if (_log.isInfoEnabled()) {
			String mvcPath = renderRequest.getParameter("mvcPath");

			_log.info("MVC path " + mvcPath);
		}

		super.render(renderRequest, renderResponse);
	}

	private static final Log _log = LogFactoryUtil.getLog(DatosBotonesVerRenderCommand.class);

}

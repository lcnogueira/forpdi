package org.forpdi.core.abstractions;

import javax.inject.Inject;

import org.forpdi.core.user.auth.UserSession;

public abstract class AbstractController extends br.com.caelum.vraptor.boilerplate.AbstractController {

	@Inject protected UserSession userSession;
}
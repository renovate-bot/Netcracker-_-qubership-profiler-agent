package org.qubership.profiler.audit;

import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionAuditListener implements HttpSessionListener {
    protected final AuditLog log = new AuditLog(LoggerFactory.getLogger(SessionAuditListener.class));

    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        log.trace("session created", httpSessionEvent.getSession());
    }

    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        log.info("logout (session timeout)", httpSessionEvent.getSession());
    }
}

package ee.paasuke.api;

import java.util.Collections;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class HeaderUtil {

    private static final Logger log = LoggerFactory.getLogger(HeaderUtil.class);

    public static void logHeaders(HttpServletRequest request) {
        log.info("Arrived request {} with following headers:", request.getRequestURL() );
        for (String headerName : Collections.list(request.getHeaderNames())) {
            log.info("header {}: {}", headerName, request.getHeader(headerName));
        }
    }

}

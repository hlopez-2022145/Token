package hernanlopez.FiltrosJwt;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.net.http.HttpHeaders;

@Component
public class FiltrosJwt extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        final String tokenResponde = getToken(request);

        if(tokenResponde == null){
            filterChain.doFilter(request, response);
            return;
        }

        filterChain.doFilter(request, response);
    }

    private String getToken(HttpServletRequest request){
        /*final String autorizacion= request.getHeader(HttpHeaders.);

        if(StringUtils.hasText(autorizacion) && autorizacion.startsWith("Bearer")){
            return  autorizacion.substring(7);
        }*/
        return  null;
    }
}

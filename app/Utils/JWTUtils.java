package Utils;

import io.jsonwebtoken.*;
import play.libs.Json;

import javax.xml.bind.DatatypeConverter;
import java.util.HashMap;

public class JWTUtils {

    public static String gerarJWT(final Object object) {
        String result = "";
        try {
            result = Jwts.builder().setClaims(new HashMap<String, Object>() {{
               put("json", Json.toJson(object));
            }}).signWith(SignatureAlgorithm.HS256, "secre").compact();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static boolean validarJWT (String jwt) {
        boolean result = false;
        try {
            Claims claims = Jwts.parser().setSigningKey(DatatypeConverter.parseBase64Binary("secre")).parseClaimsJws(jwt).getBody();
            result = true;
        } catch (SignatureException | MalformedJwtException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return result;
    }

}

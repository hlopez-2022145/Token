package hernanlopez.Demostracion;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemostracionController {
    @PostMapping(value = "mostrar")
    public String entrar(){
        return "Entrando...";
    }
}

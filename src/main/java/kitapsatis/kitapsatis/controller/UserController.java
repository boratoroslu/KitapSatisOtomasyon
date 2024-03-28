package kitapsatis.kitapsatis.controller;

import kitapsatis.kitapsatis.form.request.UserRequest;
import kitapsatis.kitapsatis.model.User;
import kitapsatis.kitapsatis.service.UserService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    /**
     * @Autowired annotation'ı, UserService türündeki bağımlılığın Spring tarafından otomatik
     * olarak enjekte edileceğini belirtir.
     */
    @Autowired
    private UserService userService;

@PostMapping("/save")
    public ResponseEntity<User> save(@RequestBody @NotNull UserRequest request){
    return ResponseEntity.ok((User) userService.save(request.getName(), request.getEmail(),request.getPassword(),request.getAddress(),request.getGsm()));
    }
@GetMapping("/all")
public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }


}

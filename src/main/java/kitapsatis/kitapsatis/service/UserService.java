package kitapsatis.kitapsatis.service;

import kitapsatis.kitapsatis.model.User;
import kitapsatis.kitapsatis.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private final UserRepository userRepository;
    private UserService userService;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(String name, String email,String password,String address,String gsm){
        User user =new User();
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setAddress(address);
        user.setGsm(gsm);
        return userRepository.save(user);
    }
    public List<kitapsatis.kitapsatis.model.User> getAll() {
        try {
            // userRepository.findAll() metodunu çağırarak tüm kullanıcıları getirir.
            return userRepository.findAll();
        }catch (Exception e){
            // Eğer herhangi bir hata oluşursa (örneğin, veritabanına erişim hatası), RuntimeException fırlatılır.
            // Bu durumda, "Kullanıcılar bulunamadı" şeklinde bir hata mesajı ile birlikte RuntimeException oluşturulur.

            throw new RuntimeException("Kullanıcılar bulunumadı");
        }
    }
    /**
     * Belirtilen kullanıcı kimliği (ID) ile bir kullanıcı arar.
     * return, Kullanıcı bulunursa, kullanıcı nesnesini döndürür. Bulunamazsa NoSuchElementException fırlatılır.
     * orElseThrow(), NoSuchElementException Belirtilen kimlikle eşleşen kullanıcı bulunamazsa fırlatılır.
     */
    @GetMapping
    public User findById(Integer id){
        return (User) userRepository.findById(id).orElseThrow();
    }
    @DeleteMapping
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

}

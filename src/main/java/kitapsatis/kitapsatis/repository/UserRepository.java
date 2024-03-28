package kitapsatis.kitapsatis.repository;

import kitapsatis.kitapsatis.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Repository annotation'ı, bu interface'in Spring Data JPA tarafından yönetilen bir repository (veri erişim)
 * interface'i olduğunu belirtir.
 * Spring Data JPA, veritabanına erişimi kolaylaştıran ve geniş bir CRUD (Create, Read, Update, Delete) işlevselliği
 * sağlayan bir kütüphanedir.
 * JpaRepository, genel CRUD işlemlerini gerçekleştirmek için gerekli olan metodları içeren bir interface'dir.
 * User sınıfının (model) ve Integer tipindeki ID alanının kullanıldığı bir JpaRepository'dir.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    void deleteById(Long id);
}
// JpaRepository, temel CRUD işlemlerini otomatik olarak sağlar.
// Özel sorgular veya işlemler eklemek için bu interface genişletilebilir.

// Herhangi özel bir metoda gerek yok, JpaRepository'nin sağladığı metotlar otomatik olarak bulunur ve kullanılabilir.
// Örneğin, findAll(), findById(), save(), delete() gibi metodlar burada otomatik olarak bulunur ve kullanılabilir.
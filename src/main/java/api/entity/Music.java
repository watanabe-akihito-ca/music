package api.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Musicエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/09/25 13:50:22")
public class Music implements Serializable {

    private static final long serialVersionUID = 1L;

    /** idプロパティ */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(precision = 10, nullable = false, unique = true)
    public Integer id;

    /** artistIdプロパティ */
    @Column(precision = 10, nullable = false, unique = false)
    public Integer artistId;

    /** titleプロパティ */
    @Column(length = 255, nullable = false, unique = false)
    public String title;

    /** outlineプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String outline;
}
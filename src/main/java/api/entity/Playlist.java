package api.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Playlistエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/09/25 13:50:22")
public class Playlist implements Serializable {

    private static final long serialVersionUID = 1L;

    /** nameプロパティ */
    @Id
    @Column(length = 255, nullable = false, unique = true)
    public String name;

    /** outlineプロパティ */
    @Column(length = 255, nullable = true, unique = false)
    public String outline;
}
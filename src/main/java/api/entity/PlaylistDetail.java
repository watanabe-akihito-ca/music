package api.entity;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * PlaylistDetailエンティティクラス
 * 
 */
@Entity
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.EntityModelFactoryImpl"}, date = "2014/09/25 13:50:22")
public class PlaylistDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /** playlistNameプロパティ */
    @Id
    @Column(length = 255, nullable = false, unique = false)
    public String playlistName;

    /** numberプロパティ */
    @Id
    @Column(precision = 10, nullable = false, unique = false)
    public Long number;

    /** musicIdプロパティ */
    @Column(precision = 10, nullable = true, unique = false)
    public Integer musicId;
}
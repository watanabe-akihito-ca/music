package api.service;

import api.entity.Playlist;
import java.util.List;
import javax.annotation.Generated;

import static api.entity.PlaylistNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Playlist}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/09/25 13:50:30")
public class PlaylistService extends AbstractService<Playlist> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param name
     *            識別子
     * @return エンティティ
     */
    public Playlist findById(String name) {
        return select().id(name).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Playlist> findAllOrderById() {
        return select().orderBy(asc(name())).getResultList();
    }
}
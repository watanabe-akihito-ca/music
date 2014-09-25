package api.service;

import api.entity.Music;
import java.util.List;
import javax.annotation.Generated;

import static api.entity.MusicNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link Music}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/09/25 13:50:30")
public class MusicService extends AbstractService<Music> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public Music findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<Music> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}
package api.service;

import api.entity.PlayHistory;
import java.util.List;
import javax.annotation.Generated;

import static api.entity.PlayHistoryNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link PlayHistory}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/09/25 13:50:30")
public class PlayHistoryService extends AbstractService<PlayHistory> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param id
     *            識別子
     * @return エンティティ
     */
    public PlayHistory findById(Integer id) {
        return select().id(id).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<PlayHistory> findAllOrderById() {
        return select().orderBy(asc(id())).getResultList();
    }
}
package api.service;

import api.entity.PlaylistDetail;
import java.util.List;
import javax.annotation.Generated;

import static api.entity.PlaylistDetailNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

/**
 * {@link PlaylistDetail}のサービスクラスです。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.ServiceModelFactoryImpl"}, date = "2014/09/25 13:50:30")
public class PlaylistDetailService extends AbstractService<PlaylistDetail> {

    /**
     * 識別子でエンティティを検索します。
     * 
     * @param playlistName
     *            識別子
     * @param number
     *            識別子
     * @return エンティティ
     */
    public PlaylistDetail findById(String playlistName, Long number) {
        return select().id(playlistName, number).getSingleResult();
    }

    /**
     * 識別子の昇順ですべてのエンティティを検索します。
     * 
     * @return エンティティのリスト
     */
    public List<PlaylistDetail> findAllOrderById() {
        return select().orderBy(asc(playlistName()), asc(number())).getResultList();
    }
}
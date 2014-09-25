package api.service;

import static api.entity.MusicNames.*;
import static org.seasar.extension.jdbc.operation.Operations.*;

import java.util.List;

import javax.annotation.Generated;

import org.h2.util.StringUtils;
import org.seasar.extension.jdbc.AutoSelect;

import api.entity.Music;
import api.entity.MusicNames;

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
     * アーティストID、タイトルで検索
     * @param artist_id
     * @param limit
     * @return
     */
    public List<Music> findbyMusicList(Integer artist_id, String title, Integer limit) {

    	AutoSelect<Music> query = select();
    	if (artist_id != null) {
    		query = query.where(MusicNames.artistId().toString(), artist_id);
    	}

    	if (!StringUtils.isNullOrEmpty(title)) {
    		query = query.where(MusicNames.title().toString(), title);
    	}

    	if (limit != null){
    		query = query.limit(limit);
    	}

    	return query.getResultList();
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
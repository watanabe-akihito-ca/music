package api.entity;

import api.entity.ArtistNames._ArtistNames;
import api.entity.MusicNames._MusicNames;
import api.entity.PlayHistoryNames._PlayHistoryNames;
import api.entity.PlaylistDetailNames._PlaylistDetailNames;
import api.entity.PlaylistNames._PlaylistNames;
import javax.annotation.Generated;

/**
 * 名前クラスの集約です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesAggregateModelFactoryImpl"}, date = "2014/09/25 13:50:26")
public class Names {

    /**
     * {@link Artist}の名前クラスを返します。
     * 
     * @return Artistの名前クラス
     */
    public static _ArtistNames artist() {
        return new _ArtistNames();
    }

    /**
     * {@link Music}の名前クラスを返します。
     * 
     * @return Musicの名前クラス
     */
    public static _MusicNames music() {
        return new _MusicNames();
    }

    /**
     * {@link PlayHistory}の名前クラスを返します。
     * 
     * @return PlayHistoryの名前クラス
     */
    public static _PlayHistoryNames playHistory() {
        return new _PlayHistoryNames();
    }

    /**
     * {@link Playlist}の名前クラスを返します。
     * 
     * @return Playlistの名前クラス
     */
    public static _PlaylistNames playlist() {
        return new _PlaylistNames();
    }

    /**
     * {@link PlaylistDetail}の名前クラスを返します。
     * 
     * @return PlaylistDetailの名前クラス
     */
    public static _PlaylistDetailNames playlistDetail() {
        return new _PlaylistDetailNames();
    }
}
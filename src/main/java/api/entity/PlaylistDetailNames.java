package api.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link PlaylistDetail}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/09/25 13:50:26")
public class PlaylistDetailNames {

    /**
     * playlistNameのプロパティ名を返します。
     * 
     * @return playlistNameのプロパティ名
     */
    public static PropertyName<String> playlistName() {
        return new PropertyName<String>("playlistName");
    }

    /**
     * numberのプロパティ名を返します。
     * 
     * @return numberのプロパティ名
     */
    public static PropertyName<Long> number() {
        return new PropertyName<Long>("number");
    }

    /**
     * musicIdのプロパティ名を返します。
     * 
     * @return musicIdのプロパティ名
     */
    public static PropertyName<Integer> musicId() {
        return new PropertyName<Integer>("musicId");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _PlaylistDetailNames extends PropertyName<PlaylistDetail> {

        /**
         * インスタンスを構築します。
         */
        public _PlaylistDetailNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _PlaylistDetailNames(final String name) {
            super(name);
        }

        /**
         * インスタンスを構築します。
         * 
         * @param parent
         *            親
         * @param name
         *            名前
         */
        public _PlaylistDetailNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * playlistNameのプロパティ名を返します。
         *
         * @return playlistNameのプロパティ名
         */
        public PropertyName<String> playlistName() {
            return new PropertyName<String>(this, "playlistName");
        }

        /**
         * numberのプロパティ名を返します。
         *
         * @return numberのプロパティ名
         */
        public PropertyName<Long> number() {
            return new PropertyName<Long>(this, "number");
        }

        /**
         * musicIdのプロパティ名を返します。
         *
         * @return musicIdのプロパティ名
         */
        public PropertyName<Integer> musicId() {
            return new PropertyName<Integer>(this, "musicId");
        }
    }
}
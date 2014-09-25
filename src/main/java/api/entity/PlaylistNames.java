package api.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Playlist}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/09/25 13:50:26")
public class PlaylistNames {

    /**
     * nameのプロパティ名を返します。
     * 
     * @return nameのプロパティ名
     */
    public static PropertyName<String> name() {
        return new PropertyName<String>("name");
    }

    /**
     * outlineのプロパティ名を返します。
     * 
     * @return outlineのプロパティ名
     */
    public static PropertyName<String> outline() {
        return new PropertyName<String>("outline");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _PlaylistNames extends PropertyName<Playlist> {

        /**
         * インスタンスを構築します。
         */
        public _PlaylistNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _PlaylistNames(final String name) {
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
        public _PlaylistNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * nameのプロパティ名を返します。
         *
         * @return nameのプロパティ名
         */
        public PropertyName<String> name() {
            return new PropertyName<String>(this, "name");
        }

        /**
         * outlineのプロパティ名を返します。
         *
         * @return outlineのプロパティ名
         */
        public PropertyName<String> outline() {
            return new PropertyName<String>(this, "outline");
        }
    }
}
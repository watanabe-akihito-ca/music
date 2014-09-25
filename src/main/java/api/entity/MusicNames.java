package api.entity;

import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link Music}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/09/25 13:50:26")
public class MusicNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
    }

    /**
     * artistIdのプロパティ名を返します。
     * 
     * @return artistIdのプロパティ名
     */
    public static PropertyName<Integer> artistId() {
        return new PropertyName<Integer>("artistId");
    }

    /**
     * titleのプロパティ名を返します。
     * 
     * @return titleのプロパティ名
     */
    public static PropertyName<String> title() {
        return new PropertyName<String>("title");
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
    public static class _MusicNames extends PropertyName<Music> {

        /**
         * インスタンスを構築します。
         */
        public _MusicNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _MusicNames(final String name) {
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
        public _MusicNames(final PropertyName<?> parent, final String name) {
            super(parent, name);
        }

        /**
         * idのプロパティ名を返します。
         *
         * @return idのプロパティ名
         */
        public PropertyName<Integer> id() {
            return new PropertyName<Integer>(this, "id");
        }

        /**
         * artistIdのプロパティ名を返します。
         *
         * @return artistIdのプロパティ名
         */
        public PropertyName<Integer> artistId() {
            return new PropertyName<Integer>(this, "artistId");
        }

        /**
         * titleのプロパティ名を返します。
         *
         * @return titleのプロパティ名
         */
        public PropertyName<String> title() {
            return new PropertyName<String>(this, "title");
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
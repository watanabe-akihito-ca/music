package api.entity;

import java.sql.Timestamp;
import javax.annotation.Generated;
import org.seasar.extension.jdbc.name.PropertyName;

/**
 * {@link PlayHistory}のプロパティ名の集合です。
 * 
 */
@Generated(value = {"S2JDBC-Gen 2.4.46", "org.seasar.extension.jdbc.gen.internal.model.NamesModelFactoryImpl"}, date = "2014/09/25 13:50:26")
public class PlayHistoryNames {

    /**
     * idのプロパティ名を返します。
     * 
     * @return idのプロパティ名
     */
    public static PropertyName<Integer> id() {
        return new PropertyName<Integer>("id");
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
     * createdAtのプロパティ名を返します。
     * 
     * @return createdAtのプロパティ名
     */
    public static PropertyName<Timestamp> createdAt() {
        return new PropertyName<Timestamp>("createdAt");
    }

    /**
     * @author S2JDBC-Gen
     */
    public static class _PlayHistoryNames extends PropertyName<PlayHistory> {

        /**
         * インスタンスを構築します。
         */
        public _PlayHistoryNames() {
        }

        /**
         * インスタンスを構築します。
         * 
         * @param name
         *            名前
         */
        public _PlayHistoryNames(final String name) {
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
        public _PlayHistoryNames(final PropertyName<?> parent, final String name) {
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
         * musicIdのプロパティ名を返します。
         *
         * @return musicIdのプロパティ名
         */
        public PropertyName<Integer> musicId() {
            return new PropertyName<Integer>(this, "musicId");
        }

        /**
         * createdAtのプロパティ名を返します。
         *
         * @return createdAtのプロパティ名
         */
        public PropertyName<Timestamp> createdAt() {
            return new PropertyName<Timestamp>(this, "createdAt");
        }
    }
}
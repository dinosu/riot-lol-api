package riot.api.common.utils;

public class StringUtils {
    public static String join(String delimiter, Object... values) {
        if (values == null) {
            throw new IllegalArgumentException("values == null");
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < values.length; ++i) {
            if (i > 0) {
                builder.append(delimiter);
            }
            builder.append(values[i]);
        }
        return builder.toString();
    }
}

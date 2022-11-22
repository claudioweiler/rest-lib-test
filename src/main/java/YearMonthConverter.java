import java.time.YearMonth;

import javax.ws.rs.ext.ParamConverter;

public class YearMonthConverter implements ParamConverter<YearMonth> {

    @Override
	public YearMonth fromString(String value) {
		if (value == null) {
            return null;
		}
		return YearMonth.parse(value);
    }

    @Override
	public String toString(YearMonth value) {
		if (value == null) {
            return null;
		}
        return value.toString();
    }

}
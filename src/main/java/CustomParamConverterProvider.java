import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.time.YearMonth;

import javax.ws.rs.ext.ParamConverter;
import javax.ws.rs.ext.ParamConverterProvider;
import javax.ws.rs.ext.Provider;

@Provider
public class CustomParamConverterProvider implements ParamConverterProvider {

	@SuppressWarnings("unchecked")
	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		if (rawType.equals(YearMonth.class)) {
			return (ParamConverter<T>) new YearMonthConverter();
		}
		return null;
	}

}
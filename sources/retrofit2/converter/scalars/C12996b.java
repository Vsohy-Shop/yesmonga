package retrofit2.converter.scalars;

import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.C13015f;

/* renamed from: retrofit2.converter.scalars.b */
public final class C12996b {

    /* renamed from: retrofit2.converter.scalars.b$a */
    public static final class C12997a implements C13015f<ResponseBody, Boolean> {

        /* renamed from: a */
        public static final C12997a f32001a = new C12997a();

        /* renamed from: a */
        public Boolean convert(ResponseBody responseBody) throws IOException {
            return Boolean.valueOf(responseBody.string());
        }
    }

    /* renamed from: retrofit2.converter.scalars.b$b */
    public static final class C12998b implements C13015f<ResponseBody, Byte> {

        /* renamed from: a */
        public static final C12998b f32002a = new C12998b();

        /* renamed from: a */
        public Byte convert(ResponseBody responseBody) throws IOException {
            return Byte.valueOf(responseBody.string());
        }
    }

    /* renamed from: retrofit2.converter.scalars.b$c */
    public static final class C12999c implements C13015f<ResponseBody, Character> {

        /* renamed from: a */
        public static final C12999c f32003a = new C12999c();

        /* renamed from: a */
        public Character convert(ResponseBody responseBody) throws IOException {
            String string = responseBody.string();
            if (string.length() == 1) {
                return Character.valueOf(string.charAt(0));
            }
            throw new IOException("Expected body of length 1 for Character conversion but was " + string.length());
        }
    }

    /* renamed from: retrofit2.converter.scalars.b$d */
    public static final class C13000d implements C13015f<ResponseBody, Double> {

        /* renamed from: a */
        public static final C13000d f32004a = new C13000d();

        /* renamed from: a */
        public Double convert(ResponseBody responseBody) throws IOException {
            return Double.valueOf(responseBody.string());
        }
    }

    /* renamed from: retrofit2.converter.scalars.b$e */
    public static final class C13001e implements C13015f<ResponseBody, Float> {

        /* renamed from: a */
        public static final C13001e f32005a = new C13001e();

        /* renamed from: a */
        public Float convert(ResponseBody responseBody) throws IOException {
            return Float.valueOf(responseBody.string());
        }
    }

    /* renamed from: retrofit2.converter.scalars.b$f */
    public static final class C13002f implements C13015f<ResponseBody, Integer> {

        /* renamed from: a */
        public static final C13002f f32006a = new C13002f();

        /* renamed from: a */
        public Integer convert(ResponseBody responseBody) throws IOException {
            return Integer.valueOf(responseBody.string());
        }
    }

    /* renamed from: retrofit2.converter.scalars.b$g */
    public static final class C13003g implements C13015f<ResponseBody, Long> {

        /* renamed from: a */
        public static final C13003g f32007a = new C13003g();

        /* renamed from: a */
        public Long convert(ResponseBody responseBody) throws IOException {
            return Long.valueOf(responseBody.string());
        }
    }

    /* renamed from: retrofit2.converter.scalars.b$h */
    public static final class C13004h implements C13015f<ResponseBody, Short> {

        /* renamed from: a */
        public static final C13004h f32008a = new C13004h();

        /* renamed from: a */
        public Short convert(ResponseBody responseBody) throws IOException {
            return Short.valueOf(responseBody.string());
        }
    }

    /* renamed from: retrofit2.converter.scalars.b$i */
    public static final class C13005i implements C13015f<ResponseBody, String> {

        /* renamed from: a */
        public static final C13005i f32009a = new C13005i();

        /* renamed from: a */
        public String convert(ResponseBody responseBody) throws IOException {
            return responseBody.string();
        }
    }
}

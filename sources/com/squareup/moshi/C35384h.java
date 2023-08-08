package com.squareup.moshi;

import com.squareup.moshi.JsonReader;
import com.squareup.moshi.internal.C35391a;
import com.squareup.moshi.internal.C35392b;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Set;
import javax.annotation.CheckReturnValue;
import javax.annotation.Nullable;
import okio.C12500m;
import okio.C12505n;
import okio.C12507o;

/* renamed from: com.squareup.moshi.h */
public abstract class C35384h<T> {

    /* renamed from: com.squareup.moshi.h$a */
    public class C35385a extends C35384h<T> {

        /* renamed from: a */
        public final /* synthetic */ C35384h f86939a;

        public C35385a(C35384h hVar) {
            this.f86939a = hVar;
        }

        @Nullable
        public T fromJson(JsonReader jsonReader) throws IOException {
            return this.f86939a.fromJson(jsonReader);
        }

        public boolean isLenient() {
            return this.f86939a.isLenient();
        }

        public void toJson(C35407q qVar, @Nullable T t) throws IOException {
            boolean k = qVar.mo106071k();
            qVar.mo106079w(true);
            try {
                this.f86939a.toJson(qVar, t);
            } finally {
                qVar.mo106079w(k);
            }
        }

        public String toString() {
            return this.f86939a + ".serializeNulls()";
        }
    }

    /* renamed from: com.squareup.moshi.h$b */
    public class C35386b extends C35384h<T> {

        /* renamed from: a */
        public final /* synthetic */ C35384h f86941a;

        public C35386b(C35384h hVar) {
            this.f86941a = hVar;
        }

        @Nullable
        public T fromJson(JsonReader jsonReader) throws IOException {
            boolean i = jsonReader.mo105879i();
            jsonReader.mo105865B(true);
            try {
                return this.f86941a.fromJson(jsonReader);
            } finally {
                jsonReader.mo105865B(i);
            }
        }

        public boolean isLenient() {
            return true;
        }

        public void toJson(C35407q qVar, @Nullable T t) throws IOException {
            boolean l = qVar.mo106072l();
            qVar.mo106078v(true);
            try {
                this.f86941a.toJson(qVar, t);
            } finally {
                qVar.mo106078v(l);
            }
        }

        public String toString() {
            return this.f86941a + ".lenient()";
        }
    }

    /* renamed from: com.squareup.moshi.h$c */
    public class C35387c extends C35384h<T> {

        /* renamed from: a */
        public final /* synthetic */ C35384h f86943a;

        public C35387c(C35384h hVar) {
            this.f86943a = hVar;
        }

        @Nullable
        public T fromJson(JsonReader jsonReader) throws IOException {
            boolean f = jsonReader.mo105876f();
            jsonReader.mo105895z(true);
            try {
                return this.f86943a.fromJson(jsonReader);
            } finally {
                jsonReader.mo105895z(f);
            }
        }

        public boolean isLenient() {
            return this.f86943a.isLenient();
        }

        public void toJson(C35407q qVar, @Nullable T t) throws IOException {
            this.f86943a.toJson(qVar, t);
        }

        public String toString() {
            return this.f86943a + ".failOnUnknown()";
        }
    }

    /* renamed from: com.squareup.moshi.h$d */
    public class C35388d extends C35384h<T> {

        /* renamed from: a */
        public final /* synthetic */ C35384h f86945a;

        /* renamed from: b */
        public final /* synthetic */ String f86946b;

        public C35388d(C35384h hVar, String str) {
            this.f86945a = hVar;
            this.f86946b = str;
        }

        @Nullable
        public T fromJson(JsonReader jsonReader) throws IOException {
            return this.f86945a.fromJson(jsonReader);
        }

        public boolean isLenient() {
            return this.f86945a.isLenient();
        }

        public void toJson(C35407q qVar, @Nullable T t) throws IOException {
            String j = qVar.mo106070j();
            qVar.mo106047u(this.f86946b);
            try {
                this.f86945a.toJson(qVar, t);
            } finally {
                qVar.mo106047u(j);
            }
        }

        public String toString() {
            return this.f86945a + ".indent(\"" + this.f86946b + "\")";
        }
    }

    /* renamed from: com.squareup.moshi.h$e */
    public interface C35389e {
        @CheckReturnValue
        @Nullable
        /* renamed from: a */
        C35384h<?> mo105947a(Type type, Set<? extends Annotation> set, C35410s sVar);
    }

    @CheckReturnValue
    public final C35384h<T> failOnUnknown() {
        return new C35387c(this);
    }

    @CheckReturnValue
    @Nullable
    public abstract T fromJson(JsonReader jsonReader) throws IOException;

    @CheckReturnValue
    @Nullable
    public final T fromJson(C12507o oVar) throws IOException {
        return fromJson(JsonReader.m145704r(oVar));
    }

    @CheckReturnValue
    @Nullable
    public final T fromJsonValue(@Nullable Object obj) {
        try {
            return fromJson((JsonReader) new C35402n(obj));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @CheckReturnValue
    public C35384h<T> indent(String str) {
        if (str != null) {
            return new C35388d(this, str);
        }
        throw new NullPointerException("indent == null");
    }

    public boolean isLenient() {
        return false;
    }

    @CheckReturnValue
    public final C35384h<T> lenient() {
        return new C35386b(this);
    }

    @CheckReturnValue
    public final C35384h<T> nonNull() {
        if (this instanceof C35391a) {
            return this;
        }
        return new C35391a(this);
    }

    @CheckReturnValue
    public final C35384h<T> nullSafe() {
        if (this instanceof C35392b) {
            return this;
        }
        return new C35392b(this);
    }

    @CheckReturnValue
    public final C35384h<T> serializeNulls() {
        return new C35385a(this);
    }

    public abstract void toJson(C35407q qVar, @Nullable T t) throws IOException;

    public final void toJson(C12505n nVar, @Nullable T t) throws IOException {
        toJson(C35407q.m145929p(nVar), t);
    }

    @CheckReturnValue
    @Nullable
    public final Object toJsonValue(@Nullable T t) {
        C35405p pVar = new C35405p();
        try {
            toJson((C35407q) pVar, t);
            return pVar.mo106062L();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @CheckReturnValue
    @Nullable
    public final T fromJson(String str) throws IOException {
        JsonReader r = JsonReader.m145704r(new C12500m().mo27236l1(str));
        T fromJson = fromJson(r);
        if (isLenient() || r.mo105888s() == JsonReader.Token.END_DOCUMENT) {
            return fromJson;
        }
        throw new JsonDataException("JSON document was not fully consumed.");
    }

    @CheckReturnValue
    public final String toJson(@Nullable T t) {
        C12500m mVar = new C12500m();
        try {
            toJson((C12505n) mVar, t);
            return mVar.mo27268B3();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}

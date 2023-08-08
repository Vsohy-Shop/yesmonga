package com.google.gson;

import com.bumptech.glide.load.engine.GlideException;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.Streams;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.JsonTreeReader;
import com.google.gson.internal.bind.JsonTreeWriter;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.C33707a;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.C33713c;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.gson.e */
public final class C33614e {

    /* renamed from: A */
    public static final boolean f81766A = false;

    /* renamed from: B */
    public static final boolean f81767B = false;

    /* renamed from: C */
    public static final C33707a<?> f81768C = C33707a.get(Object.class);

    /* renamed from: D */
    public static final String f81769D = ")]}'\n";

    /* renamed from: v */
    public static final boolean f81770v = false;

    /* renamed from: w */
    public static final boolean f81771w = false;

    /* renamed from: x */
    public static final boolean f81772x = false;

    /* renamed from: y */
    public static final boolean f81773y = true;

    /* renamed from: z */
    public static final boolean f81774z = false;

    /* renamed from: a */
    public final ThreadLocal<Map<C33707a<?>, C33620f<?>>> f81775a;

    /* renamed from: b */
    public final Map<C33707a<?>, C33708s<?>> f81776b;

    /* renamed from: c */
    public final ConstructorConstructor f81777c;

    /* renamed from: d */
    public final JsonAdapterAnnotationTypeAdapterFactory f81778d;

    /* renamed from: e */
    public final List<C33714t> f81779e;

    /* renamed from: f */
    public final Excluder f81780f;

    /* renamed from: g */
    public final C33613d f81781g;

    /* renamed from: h */
    public final Map<Type, C33622g<?>> f81782h;

    /* renamed from: i */
    public final boolean f81783i;

    /* renamed from: j */
    public final boolean f81784j;

    /* renamed from: k */
    public final boolean f81785k;

    /* renamed from: l */
    public final boolean f81786l;

    /* renamed from: m */
    public final boolean f81787m;

    /* renamed from: n */
    public final boolean f81788n;

    /* renamed from: o */
    public final boolean f81789o;

    /* renamed from: p */
    public final String f81790p;

    /* renamed from: q */
    public final int f81791q;

    /* renamed from: r */
    public final int f81792r;

    /* renamed from: s */
    public final LongSerializationPolicy f81793s;

    /* renamed from: t */
    public final List<C33714t> f81794t;

    /* renamed from: u */
    public final List<C33714t> f81795u;

    /* renamed from: com.google.gson.e$a */
    public class C33615a extends C33708s<Number> {
        public C33615a() {
        }

        /* renamed from: a */
        public Double read(C33710a aVar) throws IOException {
            if (aVar.peek() != JsonToken.NULL) {
                return Double.valueOf(aVar.nextDouble());
            }
            aVar.nextNull();
            return null;
        }

        public void write(C33713c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.nullValue();
                return;
            }
            C33614e.m135371d(number.doubleValue());
            cVar.value(number);
        }
    }

    /* renamed from: com.google.gson.e$b */
    public class C33616b extends C33708s<Number> {
        public C33616b() {
        }

        /* renamed from: a */
        public Float read(C33710a aVar) throws IOException {
            if (aVar.peek() != JsonToken.NULL) {
                return Float.valueOf((float) aVar.nextDouble());
            }
            aVar.nextNull();
            return null;
        }

        public void write(C33713c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.nullValue();
                return;
            }
            C33614e.m135371d((double) number.floatValue());
            cVar.value(number);
        }
    }

    /* renamed from: com.google.gson.e$c */
    public static class C33617c extends C33708s<Number> {
        public Number read(C33710a aVar) throws IOException {
            if (aVar.peek() != JsonToken.NULL) {
                return Long.valueOf(aVar.nextLong());
            }
            aVar.nextNull();
            return null;
        }

        public void write(C33713c cVar, Number number) throws IOException {
            if (number == null) {
                cVar.nullValue();
            } else {
                cVar.value(number.toString());
            }
        }
    }

    /* renamed from: com.google.gson.e$d */
    public static class C33618d extends C33708s<AtomicLong> {

        /* renamed from: a */
        public final /* synthetic */ C33708s f81798a;

        public C33618d(C33708s sVar) {
            this.f81798a = sVar;
        }

        /* renamed from: a */
        public AtomicLong read(C33710a aVar) throws IOException {
            return new AtomicLong(((Number) this.f81798a.read(aVar)).longValue());
        }

        /* renamed from: b */
        public void write(C33713c cVar, AtomicLong atomicLong) throws IOException {
            this.f81798a.write(cVar, Long.valueOf(atomicLong.get()));
        }
    }

    /* renamed from: com.google.gson.e$e */
    public static class C33619e extends C33708s<AtomicLongArray> {

        /* renamed from: a */
        public final /* synthetic */ C33708s f81799a;

        public C33619e(C33708s sVar) {
            this.f81799a = sVar;
        }

        /* renamed from: a */
        public AtomicLongArray read(C33710a aVar) throws IOException {
            ArrayList arrayList = new ArrayList();
            aVar.beginArray();
            while (aVar.hasNext()) {
                arrayList.add(Long.valueOf(((Number) this.f81799a.read(aVar)).longValue()));
            }
            aVar.endArray();
            int size = arrayList.size();
            AtomicLongArray atomicLongArray = new AtomicLongArray(size);
            for (int i = 0; i < size; i++) {
                atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
            }
            return atomicLongArray;
        }

        /* renamed from: b */
        public void write(C33713c cVar, AtomicLongArray atomicLongArray) throws IOException {
            cVar.beginArray();
            int length = atomicLongArray.length();
            for (int i = 0; i < length; i++) {
                this.f81799a.write(cVar, Long.valueOf(atomicLongArray.get(i)));
            }
            cVar.endArray();
        }
    }

    /* renamed from: com.google.gson.e$f */
    public static class C33620f<T> extends C33708s<T> {

        /* renamed from: a */
        public C33708s<T> f81800a;

        /* renamed from: a */
        public void mo97501a(C33708s<T> sVar) {
            if (this.f81800a == null) {
                this.f81800a = sVar;
                return;
            }
            throw new AssertionError();
        }

        public T read(C33710a aVar) throws IOException {
            C33708s<T> sVar = this.f81800a;
            if (sVar != null) {
                return sVar.read(aVar);
            }
            throw new IllegalStateException();
        }

        public void write(C33713c cVar, T t) throws IOException {
            C33708s<T> sVar = this.f81800a;
            if (sVar != null) {
                sVar.write(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public C33614e() {
        this(Excluder.DEFAULT, FieldNamingPolicy.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, LongSerializationPolicy.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    /* renamed from: a */
    public static void m135368a(Object obj, C33710a aVar) {
        if (obj != null) {
            try {
                if (aVar.peek() != JsonToken.END_DOCUMENT) {
                    throw new JsonIOException("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            }
        }
    }

    /* renamed from: b */
    public static C33708s<AtomicLong> m135369b(C33708s<Number> sVar) {
        return new C33618d(sVar).nullSafe();
    }

    /* renamed from: c */
    public static C33708s<AtomicLongArray> m135370c(C33708s<Number> sVar) {
        return new C33619e(sVar).nullSafe();
    }

    /* renamed from: d */
    public static void m135371d(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: t */
    public static C33708s<Number> m135372t(LongSerializationPolicy longSerializationPolicy) {
        if (longSerializationPolicy == LongSerializationPolicy.DEFAULT) {
            return TypeAdapters.LONG;
        }
        return new C33617c();
    }

    /* renamed from: A */
    public String mo97462A(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        mo97467F(obj, type, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: B */
    public void mo97463B(C33699k kVar, C33713c cVar) throws JsonIOException {
        boolean isLenient = cVar.isLenient();
        cVar.setLenient(true);
        boolean isHtmlSafe = cVar.isHtmlSafe();
        cVar.setHtmlSafe(this.f81786l);
        boolean serializeNulls = cVar.getSerializeNulls();
        cVar.setSerializeNulls(this.f81783i);
        try {
            Streams.write(kVar, cVar);
            cVar.setLenient(isLenient);
            cVar.setHtmlSafe(isHtmlSafe);
            cVar.setSerializeNulls(serializeNulls);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            cVar.setLenient(isLenient);
            cVar.setHtmlSafe(isHtmlSafe);
            cVar.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    /* renamed from: C */
    public void mo97464C(C33699k kVar, Appendable appendable) throws JsonIOException {
        try {
            mo97463B(kVar, mo97488w(Streams.writerForAppendable(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: D */
    public void mo97465D(Object obj, Appendable appendable) throws JsonIOException {
        if (obj != null) {
            mo97467F(obj, obj.getClass(), appendable);
        } else {
            mo97464C(C33700l.f81818a, appendable);
        }
    }

    /* renamed from: E */
    public void mo97466E(Object obj, Type type, C33713c cVar) throws JsonIOException {
        C33708s<?> p = mo97481p(C33707a.get(type));
        boolean isLenient = cVar.isLenient();
        cVar.setLenient(true);
        boolean isHtmlSafe = cVar.isHtmlSafe();
        cVar.setHtmlSafe(this.f81786l);
        boolean serializeNulls = cVar.getSerializeNulls();
        cVar.setSerializeNulls(this.f81783i);
        try {
            p.write(cVar, obj);
            cVar.setLenient(isLenient);
            cVar.setHtmlSafe(isHtmlSafe);
            cVar.setSerializeNulls(serializeNulls);
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        } catch (AssertionError e2) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e2.getMessage(), e2);
        } catch (Throwable th) {
            cVar.setLenient(isLenient);
            cVar.setHtmlSafe(isHtmlSafe);
            cVar.setSerializeNulls(serializeNulls);
            throw th;
        }
    }

    /* renamed from: F */
    public void mo97467F(Object obj, Type type, Appendable appendable) throws JsonIOException {
        try {
            mo97466E(obj, type, mo97488w(Streams.writerForAppendable(appendable)));
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    /* renamed from: G */
    public C33699k mo97468G(Object obj) {
        if (obj == null) {
            return C33700l.f81818a;
        }
        return mo97469H(obj, obj.getClass());
    }

    /* renamed from: H */
    public C33699k mo97469H(Object obj, Type type) {
        JsonTreeWriter jsonTreeWriter = new JsonTreeWriter();
        mo97466E(obj, type, jsonTreeWriter);
        return jsonTreeWriter.get();
    }

    /* renamed from: e */
    public final C33708s<Number> mo97470e(boolean z) {
        if (z) {
            return TypeAdapters.DOUBLE;
        }
        return new C33615a();
    }

    /* renamed from: f */
    public Excluder mo97471f() {
        return this.f81780f;
    }

    /* renamed from: g */
    public C33613d mo97472g() {
        return this.f81781g;
    }

    /* renamed from: h */
    public final C33708s<Number> mo97473h(boolean z) {
        if (z) {
            return TypeAdapters.FLOAT;
        }
        return new C33616b();
    }

    /* renamed from: i */
    public <T> T mo97474i(C33699k kVar, Class<T> cls) throws JsonSyntaxException {
        return Primitives.wrap(cls).cast(mo97475j(kVar, cls));
    }

    /* renamed from: j */
    public <T> T mo97475j(C33699k kVar, Type type) throws JsonSyntaxException {
        if (kVar == null) {
            return null;
        }
        return mo97476k(new JsonTreeReader(kVar), type);
    }

    /* renamed from: k */
    public <T> T mo97476k(C33710a aVar, Type type) throws JsonIOException, JsonSyntaxException {
        boolean isLenient = aVar.isLenient();
        aVar.setLenient(true);
        try {
            aVar.peek();
            T read = mo97481p(C33707a.get(type)).read(aVar);
            aVar.setLenient(isLenient);
            return read;
        } catch (EOFException e) {
            if (1 != 0) {
                aVar.setLenient(isLenient);
                return null;
            }
            throw new JsonSyntaxException((Throwable) e);
        } catch (IllegalStateException e2) {
            throw new JsonSyntaxException((Throwable) e2);
        } catch (IOException e3) {
            throw new JsonSyntaxException((Throwable) e3);
        } catch (AssertionError e4) {
            throw new AssertionError("AssertionError (GSON 2.8.5): " + e4.getMessage(), e4);
        } catch (Throwable th) {
            aVar.setLenient(isLenient);
            throw th;
        }
    }

    /* renamed from: l */
    public <T> T mo97477l(Reader reader, Class<T> cls) throws JsonSyntaxException, JsonIOException {
        C33710a v = mo97487v(reader);
        T k = mo97476k(v, cls);
        m135368a(k, v);
        return Primitives.wrap(cls).cast(k);
    }

    /* renamed from: m */
    public <T> T mo97478m(Reader reader, Type type) throws JsonIOException, JsonSyntaxException {
        C33710a v = mo97487v(reader);
        T k = mo97476k(v, type);
        m135368a(k, v);
        return k;
    }

    /* renamed from: n */
    public <T> T mo97479n(String str, Class<T> cls) throws JsonSyntaxException {
        return Primitives.wrap(cls).cast(mo97480o(str, cls));
    }

    /* renamed from: o */
    public <T> T mo97480o(String str, Type type) throws JsonSyntaxException {
        if (str == null) {
            return null;
        }
        return mo97478m(new StringReader(str), type);
    }

    /* renamed from: p */
    public <T> C33708s<T> mo97481p(C33707a<T> aVar) {
        Object obj;
        boolean z;
        Map<C33707a<?>, C33708s<?>> map = this.f81776b;
        if (aVar == null) {
            obj = f81768C;
        } else {
            obj = aVar;
        }
        C33708s<T> sVar = map.get(obj);
        if (sVar != null) {
            return sVar;
        }
        Map map2 = this.f81775a.get();
        if (map2 == null) {
            map2 = new HashMap();
            this.f81775a.set(map2);
            z = true;
        } else {
            z = false;
        }
        C33620f fVar = (C33620f) map2.get(aVar);
        if (fVar != null) {
            return fVar;
        }
        try {
            C33620f fVar2 = new C33620f();
            map2.put(aVar, fVar2);
            for (C33714t create : this.f81779e) {
                C33708s<T> create2 = create.create(this, aVar);
                if (create2 != null) {
                    fVar2.mo97501a(create2);
                    this.f81776b.put(aVar, create2);
                    return create2;
                }
            }
            throw new IllegalArgumentException("GSON (2.8.5) cannot handle " + aVar);
        } finally {
            map2.remove(aVar);
            if (z) {
                this.f81775a.remove();
            }
        }
    }

    /* renamed from: q */
    public <T> C33708s<T> mo97482q(Class<T> cls) {
        return mo97481p(C33707a.get(cls));
    }

    /* renamed from: r */
    public <T> C33708s<T> mo97483r(C33714t tVar, C33707a<T> aVar) {
        if (!this.f81779e.contains(tVar)) {
            tVar = this.f81778d;
        }
        boolean z = false;
        for (C33714t next : this.f81779e) {
            if (z) {
                C33708s<T> create = next.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (next == tVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* renamed from: s */
    public boolean mo97484s() {
        return this.f81786l;
    }

    public String toString() {
        return "{serializeNulls:" + this.f81783i + ",factories:" + this.f81779e + ",instanceCreators:" + this.f81777c + "}";
    }

    /* renamed from: u */
    public C33621f mo97486u() {
        return new C33621f(this);
    }

    /* renamed from: v */
    public C33710a mo97487v(Reader reader) {
        C33710a aVar = new C33710a(reader);
        aVar.setLenient(this.f81788n);
        return aVar;
    }

    /* renamed from: w */
    public C33713c mo97488w(Writer writer) throws IOException {
        if (this.f81785k) {
            writer.write(f81769D);
        }
        C33713c cVar = new C33713c(writer);
        if (this.f81787m) {
            cVar.setIndent(GlideException.C22148a.f56917d);
        }
        cVar.setSerializeNulls(this.f81783i);
        return cVar;
    }

    /* renamed from: x */
    public boolean mo97489x() {
        return this.f81783i;
    }

    /* renamed from: y */
    public String mo97490y(C33699k kVar) {
        StringWriter stringWriter = new StringWriter();
        mo97464C(kVar, stringWriter);
        return stringWriter.toString();
    }

    /* renamed from: z */
    public String mo97491z(Object obj) {
        if (obj == null) {
            return mo97490y(C33700l.f81818a);
        }
        return mo97462A(obj, obj.getClass());
    }

    public C33614e(Excluder excluder, C33613d dVar, Map<Type, C33622g<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, LongSerializationPolicy longSerializationPolicy, String str, int i, int i2, List<C33714t> list, List<C33714t> list2, List<C33714t> list3) {
        boolean z8 = z2;
        boolean z9 = z7;
        this.f81775a = new ThreadLocal<>();
        this.f81776b = new ConcurrentHashMap();
        this.f81780f = excluder;
        this.f81781g = dVar;
        this.f81782h = map;
        ConstructorConstructor constructorConstructor = new ConstructorConstructor(map);
        this.f81777c = constructorConstructor;
        this.f81783i = z;
        this.f81784j = z8;
        this.f81785k = z3;
        this.f81786l = z4;
        this.f81787m = z5;
        this.f81788n = z6;
        this.f81789o = z9;
        this.f81793s = longSerializationPolicy;
        this.f81790p = str;
        this.f81791q = i;
        this.f81792r = i2;
        this.f81794t = list;
        this.f81795u = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.JSON_ELEMENT_FACTORY);
        arrayList.add(ObjectTypeAdapter.FACTORY);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.STRING_FACTORY);
        arrayList.add(TypeAdapters.INTEGER_FACTORY);
        arrayList.add(TypeAdapters.BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.BYTE_FACTORY);
        arrayList.add(TypeAdapters.SHORT_FACTORY);
        C33708s<Number> t = m135372t(longSerializationPolicy);
        arrayList.add(TypeAdapters.newFactory(Long.TYPE, Long.class, t));
        arrayList.add(TypeAdapters.newFactory(Double.TYPE, Double.class, mo97470e(z9)));
        arrayList.add(TypeAdapters.newFactory(Float.TYPE, Float.class, mo97473h(z9)));
        arrayList.add(TypeAdapters.NUMBER_FACTORY);
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_FACTORY);
        arrayList.add(TypeAdapters.ATOMIC_BOOLEAN_FACTORY);
        arrayList.add(TypeAdapters.newFactory(AtomicLong.class, m135369b(t)));
        arrayList.add(TypeAdapters.newFactory(AtomicLongArray.class, m135370c(t)));
        arrayList.add(TypeAdapters.ATOMIC_INTEGER_ARRAY_FACTORY);
        arrayList.add(TypeAdapters.CHARACTER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUILDER_FACTORY);
        arrayList.add(TypeAdapters.STRING_BUFFER_FACTORY);
        arrayList.add(TypeAdapters.newFactory(BigDecimal.class, TypeAdapters.BIG_DECIMAL));
        arrayList.add(TypeAdapters.newFactory(BigInteger.class, TypeAdapters.BIG_INTEGER));
        arrayList.add(TypeAdapters.URL_FACTORY);
        arrayList.add(TypeAdapters.URI_FACTORY);
        arrayList.add(TypeAdapters.UUID_FACTORY);
        arrayList.add(TypeAdapters.CURRENCY_FACTORY);
        arrayList.add(TypeAdapters.LOCALE_FACTORY);
        arrayList.add(TypeAdapters.INET_ADDRESS_FACTORY);
        arrayList.add(TypeAdapters.BIT_SET_FACTORY);
        arrayList.add(DateTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CALENDAR_FACTORY);
        arrayList.add(TimeTypeAdapter.FACTORY);
        arrayList.add(SqlDateTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.TIMESTAMP_FACTORY);
        arrayList.add(ArrayTypeAdapter.FACTORY);
        arrayList.add(TypeAdapters.CLASS_FACTORY);
        arrayList.add(new CollectionTypeAdapterFactory(constructorConstructor));
        arrayList.add(new MapTypeAdapterFactory(constructorConstructor, z8));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(constructorConstructor);
        this.f81778d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.ENUM_FACTORY);
        arrayList.add(new ReflectiveTypeAdapterFactory(constructorConstructor, dVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f81779e = Collections.unmodifiableList(arrayList);
    }
}

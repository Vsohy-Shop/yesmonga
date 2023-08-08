package com.google.gson.internal.bind;

import com.google.gson.C33614e;
import com.google.gson.C33624i;
import com.google.gson.C33698j;
import com.google.gson.C33699k;
import com.google.gson.C33704p;
import com.google.gson.C33705q;
import com.google.gson.C33708s;
import com.google.gson.C33714t;
import com.google.gson.JsonParseException;
import com.google.gson.internal.C$Gson$Preconditions;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.C33707a;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.C33713c;
import java.io.IOException;
import java.lang.reflect.Type;

public final class TreeTypeAdapter<T> extends C33708s<T> {
    private final TreeTypeAdapter<T>.GsonContextImpl context = new GsonContextImpl();
    private C33708s<T> delegate;
    private final C33698j<T> deserializer;
    final C33614e gson;
    private final C33705q<T> serializer;
    private final C33714t skipPast;
    private final C33707a<T> typeToken;

    public final class GsonContextImpl implements C33704p, C33624i {
        private GsonContextImpl() {
        }

        public <R> R deserialize(C33699k kVar, Type type) throws JsonParseException {
            return TreeTypeAdapter.this.gson.mo97475j(kVar, type);
        }

        public C33699k serialize(Object obj) {
            return TreeTypeAdapter.this.gson.mo97468G(obj);
        }

        public C33699k serialize(Object obj, Type type) {
            return TreeTypeAdapter.this.gson.mo97469H(obj, type);
        }
    }

    public static final class SingleTypeFactory implements C33714t {
        private final C33698j<?> deserializer;
        private final C33707a<?> exactType;
        private final Class<?> hierarchyType;
        private final boolean matchRawType;
        private final C33705q<?> serializer;

        public SingleTypeFactory(Object obj, C33707a<?> aVar, boolean z, Class<?> cls) {
            C33705q<?> qVar;
            boolean z2;
            C33698j<?> jVar = null;
            if (obj instanceof C33705q) {
                qVar = (C33705q) obj;
            } else {
                qVar = null;
            }
            this.serializer = qVar;
            jVar = obj instanceof C33698j ? (C33698j) obj : jVar;
            this.deserializer = jVar;
            if (qVar == null && jVar == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            C$Gson$Preconditions.checkArgument(z2);
            this.exactType = aVar;
            this.matchRawType = z;
            this.hierarchyType = cls;
        }

        public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
            boolean z;
            C33707a<?> aVar2 = this.exactType;
            if (aVar2 == null) {
                z = this.hierarchyType.isAssignableFrom(aVar.getRawType());
            } else if (aVar2.equals(aVar) || (this.matchRawType && this.exactType.getType() == aVar.getRawType())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return new TreeTypeAdapter(this.serializer, this.deserializer, eVar, aVar, this);
            }
            return null;
        }
    }

    public TreeTypeAdapter(C33705q<T> qVar, C33698j<T> jVar, C33614e eVar, C33707a<T> aVar, C33714t tVar) {
        this.serializer = qVar;
        this.deserializer = jVar;
        this.gson = eVar;
        this.typeToken = aVar;
        this.skipPast = tVar;
    }

    private C33708s<T> delegate() {
        C33708s<T> sVar = this.delegate;
        if (sVar != null) {
            return sVar;
        }
        C33708s<T> r = this.gson.mo97483r(this.skipPast, this.typeToken);
        this.delegate = r;
        return r;
    }

    public static C33714t newFactory(C33707a<?> aVar, Object obj) {
        return new SingleTypeFactory(obj, aVar, false, (Class<?>) null);
    }

    public static C33714t newFactoryWithMatchRawType(C33707a<?> aVar, Object obj) {
        boolean z;
        if (aVar.getType() == aVar.getRawType()) {
            z = true;
        } else {
            z = false;
        }
        return new SingleTypeFactory(obj, aVar, z, (Class<?>) null);
    }

    public static C33714t newTypeHierarchyFactory(Class<?> cls, Object obj) {
        return new SingleTypeFactory(obj, (C33707a<?>) null, false, cls);
    }

    public T read(C33710a aVar) throws IOException {
        if (this.deserializer == null) {
            return delegate().read(aVar);
        }
        C33699k parse = Streams.parse(aVar);
        if (parse.mo97773j0()) {
            return null;
        }
        return this.deserializer.mo84115a(parse, this.typeToken.getType(), this.context);
    }

    public void write(C33713c cVar, T t) throws IOException {
        C33705q<T> qVar = this.serializer;
        if (qVar == null) {
            delegate().write(cVar, t);
        } else if (t == null) {
            cVar.nullValue();
        } else {
            Streams.write(qVar.mo97809a(t, this.typeToken.getType(), this.context), cVar);
        }
    }
}

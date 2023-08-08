package com.google.gson.internal.bind;

import com.google.gson.C33614e;
import com.google.gson.C33699k;
import com.google.gson.C33703o;
import com.google.gson.C33708s;
import com.google.gson.C33714t;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Streams;
import com.google.gson.reflect.C33707a;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.C33713c;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

public final class MapTypeAdapterFactory implements C33714t {
    final boolean complexMapKeySerialization;
    private final ConstructorConstructor constructorConstructor;

    public final class Adapter<K, V> extends C33708s<Map<K, V>> {
        private final ObjectConstructor<? extends Map<K, V>> constructor;
        private final C33708s<K> keyTypeAdapter;
        private final C33708s<V> valueTypeAdapter;

        public Adapter(C33614e eVar, Type type, C33708s<K> sVar, Type type2, C33708s<V> sVar2, ObjectConstructor<? extends Map<K, V>> objectConstructor) {
            this.keyTypeAdapter = new TypeAdapterRuntimeTypeWrapper(eVar, sVar, type);
            this.valueTypeAdapter = new TypeAdapterRuntimeTypeWrapper(eVar, sVar2, type2);
            this.constructor = objectConstructor;
        }

        private String keyToString(C33699k kVar) {
            if (kVar.mo97775l0()) {
                C33703o X = kVar.mo97771X();
                if (X.mo97806p0()) {
                    return String.valueOf(X.mo97532e0());
                }
                if (X.mo97805n0()) {
                    return Boolean.toString(X.mo97540k());
                }
                if (X.mo97807s0()) {
                    return X.mo97536h0();
                }
                throw new AssertionError();
            } else if (kVar.mo97773j0()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        public Map<K, V> read(C33710a aVar) throws IOException {
            JsonToken peek = aVar.peek();
            if (peek == JsonToken.NULL) {
                aVar.nextNull();
                return null;
            }
            Map<K, V> map = (Map) this.constructor.construct();
            if (peek == JsonToken.BEGIN_ARRAY) {
                aVar.beginArray();
                while (aVar.hasNext()) {
                    aVar.beginArray();
                    K read = this.keyTypeAdapter.read(aVar);
                    if (map.put(read, this.valueTypeAdapter.read(aVar)) == null) {
                        aVar.endArray();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + read);
                    }
                }
                aVar.endArray();
            } else {
                aVar.beginObject();
                while (aVar.hasNext()) {
                    JsonReaderInternalAccess.INSTANCE.promoteNameToValue(aVar);
                    K read2 = this.keyTypeAdapter.read(aVar);
                    if (map.put(read2, this.valueTypeAdapter.read(aVar)) != null) {
                        throw new JsonSyntaxException("duplicate key: " + read2);
                    }
                }
                aVar.endObject();
            }
            return map;
        }

        public void write(C33713c cVar, Map<K, V> map) throws IOException {
            if (map == null) {
                cVar.nullValue();
            } else if (!MapTypeAdapterFactory.this.complexMapKeySerialization) {
                cVar.beginObject();
                for (Map.Entry next : map.entrySet()) {
                    cVar.name(String.valueOf(next.getKey()));
                    this.valueTypeAdapter.write(cVar, next.getValue());
                }
                cVar.endObject();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry next2 : map.entrySet()) {
                    C33699k jsonTree = this.keyTypeAdapter.toJsonTree(next2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(next2.getValue());
                    z |= jsonTree.mo97772i0() || jsonTree.mo97774k0();
                }
                if (z) {
                    cVar.beginArray();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.beginArray();
                        Streams.write((C33699k) arrayList.get(i), cVar);
                        this.valueTypeAdapter.write(cVar, arrayList2.get(i));
                        cVar.endArray();
                        i++;
                    }
                    cVar.endArray();
                    return;
                }
                cVar.beginObject();
                int size2 = arrayList.size();
                while (i < size2) {
                    cVar.name(keyToString((C33699k) arrayList.get(i)));
                    this.valueTypeAdapter.write(cVar, arrayList2.get(i));
                    i++;
                }
                cVar.endObject();
            }
        }
    }

    public MapTypeAdapterFactory(ConstructorConstructor constructorConstructor2, boolean z) {
        this.constructorConstructor = constructorConstructor2;
        this.complexMapKeySerialization = z;
    }

    private C33708s<?> getKeyAdapter(C33614e eVar, Type type) {
        if (type == Boolean.TYPE || type == Boolean.class) {
            return TypeAdapters.BOOLEAN_AS_STRING;
        }
        return eVar.mo97481p(C33707a.get(type));
    }

    public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        Type[] mapKeyAndValueTypes = C$Gson$Types.getMapKeyAndValueTypes(type, C$Gson$Types.getRawType(type));
        return new Adapter(eVar, mapKeyAndValueTypes[0], getKeyAdapter(eVar, mapKeyAndValueTypes[0]), mapKeyAndValueTypes[1], eVar.mo97481p(C33707a.get(mapKeyAndValueTypes[1])), this.constructorConstructor.get(aVar));
    }
}

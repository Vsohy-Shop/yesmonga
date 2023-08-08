package com.google.gson.internal.bind;

import com.google.gson.C33614e;
import com.google.gson.C33708s;
import com.google.gson.C33714t;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.reflect.C33707a;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.C33713c;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

public final class CollectionTypeAdapterFactory implements C33714t {
    private final ConstructorConstructor constructorConstructor;

    public static final class Adapter<E> extends C33708s<Collection<E>> {
        private final ObjectConstructor<? extends Collection<E>> constructor;
        private final C33708s<E> elementTypeAdapter;

        public Adapter(C33614e eVar, Type type, C33708s<E> sVar, ObjectConstructor<? extends Collection<E>> objectConstructor) {
            this.elementTypeAdapter = new TypeAdapterRuntimeTypeWrapper(eVar, sVar, type);
            this.constructor = objectConstructor;
        }

        public Collection<E> read(C33710a aVar) throws IOException {
            if (aVar.peek() == JsonToken.NULL) {
                aVar.nextNull();
                return null;
            }
            Collection<E> collection = (Collection) this.constructor.construct();
            aVar.beginArray();
            while (aVar.hasNext()) {
                collection.add(this.elementTypeAdapter.read(aVar));
            }
            aVar.endArray();
            return collection;
        }

        public void write(C33713c cVar, Collection<E> collection) throws IOException {
            if (collection == null) {
                cVar.nullValue();
                return;
            }
            cVar.beginArray();
            for (E write : collection) {
                this.elementTypeAdapter.write(cVar, write);
            }
            cVar.endArray();
        }
    }

    public CollectionTypeAdapterFactory(ConstructorConstructor constructorConstructor2) {
        this.constructorConstructor = constructorConstructor2;
    }

    public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
        Type type = aVar.getType();
        Class<? super T> rawType = aVar.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type collectionElementType = C$Gson$Types.getCollectionElementType(type, rawType);
        return new Adapter(eVar, collectionElementType, eVar.mo97481p(C33707a.get(collectionElementType)), this.constructorConstructor.get(aVar));
    }
}

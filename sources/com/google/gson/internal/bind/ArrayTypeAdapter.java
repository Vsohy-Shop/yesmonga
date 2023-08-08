package com.google.gson.internal.bind;

import com.google.gson.C33614e;
import com.google.gson.C33708s;
import com.google.gson.C33714t;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.reflect.C33707a;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.C33713c;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

public final class ArrayTypeAdapter<E> extends C33708s<Object> {
    public static final C33714t FACTORY = new C33714t() {
        public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
            Type type = aVar.getType();
            if (!(type instanceof GenericArrayType) && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type arrayComponentType = C$Gson$Types.getArrayComponentType(type);
            return new ArrayTypeAdapter(eVar, eVar.mo97481p(C33707a.get(arrayComponentType)), C$Gson$Types.getRawType(arrayComponentType));
        }
    };
    private final Class<E> componentType;
    private final C33708s<E> componentTypeAdapter;

    public ArrayTypeAdapter(C33614e eVar, C33708s<E> sVar, Class<E> cls) {
        this.componentTypeAdapter = new TypeAdapterRuntimeTypeWrapper(eVar, sVar, cls);
        this.componentType = cls;
    }

    public Object read(C33710a aVar) throws IOException {
        if (aVar.peek() == JsonToken.NULL) {
            aVar.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.beginArray();
        while (aVar.hasNext()) {
            arrayList.add(this.componentTypeAdapter.read(aVar));
        }
        aVar.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance(this.componentType, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    public void write(C33713c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.nullValue();
            return;
        }
        cVar.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.componentTypeAdapter.write(cVar, Array.get(obj, i));
        }
        cVar.endArray();
    }
}

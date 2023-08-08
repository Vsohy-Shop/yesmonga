package com.google.gson.internal.bind;

import com.google.gson.C33614e;
import com.google.gson.C33708s;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.C33707a;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.C33713c;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class TypeAdapterRuntimeTypeWrapper<T> extends C33708s<T> {
    private final C33614e context;
    private final C33708s<T> delegate;
    private final Type type;

    public TypeAdapterRuntimeTypeWrapper(C33614e eVar, C33708s<T> sVar, Type type2) {
        this.context = eVar;
        this.delegate = sVar;
        this.type = type2;
    }

    private Type getRuntimeTypeIfMoreSpecific(Type type2, Object obj) {
        if (obj == null) {
            return type2;
        }
        if (type2 == Object.class || (type2 instanceof TypeVariable) || (type2 instanceof Class)) {
            return obj.getClass();
        }
        return type2;
    }

    public T read(C33710a aVar) throws IOException {
        return this.delegate.read(aVar);
    }

    public void write(C33713c cVar, T t) throws IOException {
        C33708s<T> sVar = this.delegate;
        Type runtimeTypeIfMoreSpecific = getRuntimeTypeIfMoreSpecific(this.type, t);
        if (runtimeTypeIfMoreSpecific != this.type) {
            sVar = this.context.mo97481p(C33707a.get(runtimeTypeIfMoreSpecific));
            if (sVar instanceof ReflectiveTypeAdapterFactory.Adapter) {
                C33708s<T> sVar2 = this.delegate;
                if (!(sVar2 instanceof ReflectiveTypeAdapterFactory.Adapter)) {
                    sVar = sVar2;
                }
            }
        }
        sVar.write(cVar, t);
    }
}

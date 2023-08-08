package com.google.gson.internal.bind;

import com.google.gson.C33613d;
import com.google.gson.C33614e;
import com.google.gson.C33708s;
import com.google.gson.C33714t;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.C33607b;
import com.google.gson.annotations.C33608c;
import com.google.gson.internal.C$Gson$Types;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.internal.reflect.ReflectionAccessor;
import com.google.gson.reflect.C33707a;
import com.google.gson.stream.C33710a;
import com.google.gson.stream.C33713c;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ReflectiveTypeAdapterFactory implements C33714t {
    private final ReflectionAccessor accessor = ReflectionAccessor.getInstance();
    private final ConstructorConstructor constructorConstructor;
    private final Excluder excluder;
    private final C33613d fieldNamingPolicy;
    private final JsonAdapterAnnotationTypeAdapterFactory jsonAdapterFactory;

    public static final class Adapter<T> extends C33708s<T> {
        private final Map<String, BoundField> boundFields;
        private final ObjectConstructor<T> constructor;

        public Adapter(ObjectConstructor<T> objectConstructor, Map<String, BoundField> map) {
            this.constructor = objectConstructor;
            this.boundFields = map;
        }

        public T read(C33710a aVar) throws IOException {
            if (aVar.peek() == JsonToken.NULL) {
                aVar.nextNull();
                return null;
            }
            T construct = this.constructor.construct();
            try {
                aVar.beginObject();
                while (aVar.hasNext()) {
                    BoundField boundField = this.boundFields.get(aVar.nextName());
                    if (boundField != null) {
                        if (boundField.deserialized) {
                            boundField.read(aVar, construct);
                        }
                    }
                    aVar.skipValue();
                }
                aVar.endObject();
                return construct;
            } catch (IllegalStateException e) {
                throw new JsonSyntaxException((Throwable) e);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public void write(C33713c cVar, T t) throws IOException {
            if (t == null) {
                cVar.nullValue();
                return;
            }
            cVar.beginObject();
            try {
                for (BoundField next : this.boundFields.values()) {
                    if (next.writeField(t)) {
                        cVar.name(next.name);
                        next.write(cVar, t);
                    }
                }
                cVar.endObject();
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            }
        }
    }

    public static abstract class BoundField {
        final boolean deserialized;
        final String name;
        final boolean serialized;

        public BoundField(String str, boolean z, boolean z2) {
            this.name = str;
            this.serialized = z;
            this.deserialized = z2;
        }

        public abstract void read(C33710a aVar, Object obj) throws IOException, IllegalAccessException;

        public abstract void write(C33713c cVar, Object obj) throws IOException, IllegalAccessException;

        public abstract boolean writeField(Object obj) throws IOException, IllegalAccessException;
    }

    public ReflectiveTypeAdapterFactory(ConstructorConstructor constructorConstructor2, C33613d dVar, Excluder excluder2, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory) {
        this.constructorConstructor = constructorConstructor2;
        this.fieldNamingPolicy = dVar;
        this.excluder = excluder2;
        this.jsonAdapterFactory = jsonAdapterAnnotationTypeAdapterFactory;
    }

    private BoundField createBoundField(C33614e eVar, Field field, String str, C33707a<?> aVar, boolean z, boolean z2) {
        C33708s<?> sVar;
        boolean z3;
        C33614e eVar2 = eVar;
        C33707a<?> aVar2 = aVar;
        final boolean isPrimitive = Primitives.isPrimitive(aVar.getRawType());
        Field field2 = field;
        C33607b bVar = (C33607b) field.getAnnotation(C33607b.class);
        if (bVar != null) {
            sVar = this.jsonAdapterFactory.getTypeAdapter(this.constructorConstructor, eVar, aVar2, bVar);
        } else {
            sVar = null;
        }
        if (sVar != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        final boolean z4 = z3;
        if (sVar == null) {
            sVar = eVar.mo97481p(aVar2);
        }
        final C33708s<?> sVar2 = sVar;
        final Field field3 = field;
        final C33614e eVar3 = eVar;
        final C33707a<?> aVar3 = aVar;
        return new BoundField(str, z, z2) {
            public void read(C33710a aVar, Object obj) throws IOException, IllegalAccessException {
                Object read = sVar2.read(aVar);
                if (read != null || !isPrimitive) {
                    field3.set(obj, read);
                }
            }

            public void write(C33713c cVar, Object obj) throws IOException, IllegalAccessException {
                C33708s sVar;
                Object obj2 = field3.get(obj);
                if (z4) {
                    sVar = sVar2;
                } else {
                    sVar = new TypeAdapterRuntimeTypeWrapper(eVar3, sVar2, aVar3.getType());
                }
                sVar.write(cVar, obj2);
            }

            public boolean writeField(Object obj) throws IOException, IllegalAccessException {
                if (this.serialized && field3.get(obj) != obj) {
                    return true;
                }
                return false;
            }
        };
    }

    private Map<String, BoundField> getBoundFields(C33614e eVar, C33707a<?> aVar, Class<?> cls) {
        boolean z;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (cls.isInterface()) {
            return linkedHashMap;
        }
        Type type = aVar.getType();
        C33707a<?> aVar2 = aVar;
        Class<? super Object> cls2 = cls;
        while (cls2 != Object.class) {
            Field[] declaredFields = cls2.getDeclaredFields();
            int length = declaredFields.length;
            boolean z2 = false;
            int i = 0;
            while (i < length) {
                Field field = declaredFields[i];
                boolean excludeField = excludeField(field, true);
                boolean excludeField2 = excludeField(field, z2);
                if (excludeField || excludeField2) {
                    this.accessor.makeAccessible(field);
                    Type resolve = C$Gson$Types.resolve(aVar2.getType(), cls2, field.getGenericType());
                    List<String> fieldNames = getFieldNames(field);
                    int size = fieldNames.size();
                    BoundField boundField = null;
                    int i2 = z2;
                    while (i2 < size) {
                        String str = fieldNames.get(i2);
                        if (i2 != 0) {
                            z = z2;
                        } else {
                            z = excludeField;
                        }
                        String str2 = str;
                        int i3 = i2;
                        BoundField boundField2 = boundField;
                        int i4 = size;
                        List<String> list = fieldNames;
                        Field field2 = field;
                        BoundField boundField3 = (BoundField) linkedHashMap.put(str2, createBoundField(eVar, field, str2, C33707a.get(resolve), z, excludeField2));
                        if (boundField2 == null) {
                            boundField = boundField3;
                        } else {
                            boundField = boundField2;
                        }
                        i2 = i3 + 1;
                        excludeField = z;
                        fieldNames = list;
                        size = i4;
                        field = field2;
                        z2 = false;
                    }
                    BoundField boundField4 = boundField;
                    if (boundField4 != null) {
                        throw new IllegalArgumentException(type + " declares multiple JSON fields named " + boundField4.name);
                    }
                }
                i++;
                z2 = false;
            }
            aVar2 = C33707a.get(C$Gson$Types.resolve(aVar2.getType(), cls2, cls2.getGenericSuperclass()));
            cls2 = aVar2.getRawType();
        }
        return linkedHashMap;
    }

    private List<String> getFieldNames(Field field) {
        C33608c cVar = (C33608c) field.getAnnotation(C33608c.class);
        if (cVar == null) {
            return Collections.singletonList(this.fieldNamingPolicy.mo97436b(field));
        }
        String value = cVar.value();
        String[] alternate = cVar.alternate();
        if (alternate.length == 0) {
            return Collections.singletonList(value);
        }
        ArrayList arrayList = new ArrayList(alternate.length + 1);
        arrayList.add(value);
        for (String add : alternate) {
            arrayList.add(add);
        }
        return arrayList;
    }

    public <T> C33708s<T> create(C33614e eVar, C33707a<T> aVar) {
        Class<? super T> rawType = aVar.getRawType();
        if (!Object.class.isAssignableFrom(rawType)) {
            return null;
        }
        return new Adapter(this.constructorConstructor.get(aVar), getBoundFields(eVar, aVar, rawType));
    }

    public boolean excludeField(Field field, boolean z) {
        return excludeField(field, z, this.excluder);
    }

    public static boolean excludeField(Field field, boolean z, Excluder excluder2) {
        return !excluder2.excludeClass(field.getType(), z) && !excluder2.excludeField(field, z);
    }
}

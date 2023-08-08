package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class JavaUtilCollectionsDeserializers {
    private static final Class<?> CLASS_AS_ARRAYS_LIST = Arrays.asList(new Object[]{null, null}).getClass();
    private static final Class<?> CLASS_SINGLETON_LIST;
    private static final Class<?> CLASS_SINGLETON_MAP;
    private static final Class<?> CLASS_SINGLETON_SET;
    private static final Class<?> CLASS_UNMODIFIABLE_LIST;
    private static final Class<?> CLASS_UNMODIFIABLE_LIST_ALIAS = Collections.unmodifiableList(new LinkedList()).getClass();
    private static final Class<?> CLASS_UNMODIFIABLE_MAP;
    private static final Class<?> CLASS_UNMODIFIABLE_SET;
    private static final String PREFIX_JAVA_UTIL_COLLECTIONS = "java.util.Collections$";
    public static final int TYPE_AS_LIST = 11;
    private static final int TYPE_SINGLETON_LIST = 2;
    private static final int TYPE_SINGLETON_MAP = 3;
    private static final int TYPE_SINGLETON_SET = 1;
    private static final int TYPE_SYNC_COLLECTION = 8;
    private static final int TYPE_SYNC_LIST = 9;
    private static final int TYPE_SYNC_MAP = 10;
    private static final int TYPE_SYNC_SET = 7;
    private static final int TYPE_UNMODIFIABLE_LIST = 5;
    private static final int TYPE_UNMODIFIABLE_MAP = 6;
    private static final int TYPE_UNMODIFIABLE_SET = 4;

    public static class JavaUtilCollectionsConverter implements Converter<Object, Object> {
        private final JavaType _inputType;
        private final int _kind;

        public JavaUtilCollectionsConverter(int i, JavaType javaType) {
            this._inputType = javaType;
            this._kind = i;
        }

        private void _checkSingleton(int i) {
            if (i != 1) {
                throw new IllegalArgumentException("Can not deserialize Singleton container from " + i + " entries");
            }
        }

        public Object convert(Object obj) {
            if (obj == null) {
                return null;
            }
            switch (this._kind) {
                case 1:
                    Set set = (Set) obj;
                    _checkSingleton(set.size());
                    return Collections.singleton(set.iterator().next());
                case 2:
                    List list = (List) obj;
                    _checkSingleton(list.size());
                    return Collections.singletonList(list.get(0));
                case 3:
                    Map map = (Map) obj;
                    _checkSingleton(map.size());
                    Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
                    return Collections.singletonMap(entry.getKey(), entry.getValue());
                case 4:
                    return Collections.unmodifiableSet((Set) obj);
                case 5:
                    return Collections.unmodifiableList((List) obj);
                case 6:
                    return Collections.unmodifiableMap((Map) obj);
                case 7:
                    return Collections.synchronizedSet((Set) obj);
                case 8:
                    return Collections.synchronizedCollection((Collection) obj);
                case 9:
                    return Collections.synchronizedList((List) obj);
                case 10:
                    return Collections.synchronizedMap((Map) obj);
                default:
                    return obj;
            }
        }

        public JavaType getInputType(TypeFactory typeFactory) {
            return this._inputType;
        }

        public JavaType getOutputType(TypeFactory typeFactory) {
            return this._inputType;
        }
    }

    static {
        Boolean bool = Boolean.TRUE;
        Set singleton = Collections.singleton(bool);
        CLASS_SINGLETON_SET = singleton.getClass();
        CLASS_UNMODIFIABLE_SET = Collections.unmodifiableSet(singleton).getClass();
        List singletonList = Collections.singletonList(bool);
        CLASS_SINGLETON_LIST = singletonList.getClass();
        CLASS_UNMODIFIABLE_LIST = Collections.unmodifiableList(singletonList).getClass();
        Map singletonMap = Collections.singletonMap("a", "b");
        CLASS_SINGLETON_MAP = singletonMap.getClass();
        CLASS_UNMODIFIABLE_MAP = Collections.unmodifiableMap(singletonMap).getClass();
    }

    private static String _findUtilCollectionsTypeName(Class<?> cls) {
        String name = cls.getName();
        if (name.startsWith(PREFIX_JAVA_UTIL_COLLECTIONS)) {
            return name.substring(22);
        }
        return "";
    }

    private static String _findUtilSyncTypeName(Class<?> cls) {
        String _findUtilCollectionsTypeName = _findUtilCollectionsTypeName(cls);
        if (_findUtilCollectionsTypeName == null || !_findUtilCollectionsTypeName.startsWith("Synchronized")) {
            return "";
        }
        return _findUtilCollectionsTypeName.substring(12);
    }

    public static JavaUtilCollectionsConverter converter(int i, JavaType javaType, Class<?> cls) {
        return new JavaUtilCollectionsConverter(i, javaType.findSuperType(cls));
    }

    public static JsonDeserializer<?> findForCollection(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        JavaUtilCollectionsConverter javaUtilCollectionsConverter;
        Class<List> cls = List.class;
        if (javaType.hasRawClass(CLASS_AS_ARRAYS_LIST)) {
            javaUtilCollectionsConverter = converter(11, javaType, cls);
        } else if (javaType.hasRawClass(CLASS_SINGLETON_LIST)) {
            javaUtilCollectionsConverter = converter(2, javaType, cls);
        } else {
            Class<Set> cls2 = Set.class;
            if (javaType.hasRawClass(CLASS_SINGLETON_SET)) {
                javaUtilCollectionsConverter = converter(1, javaType, cls2);
            } else if (javaType.hasRawClass(CLASS_UNMODIFIABLE_LIST) || javaType.hasRawClass(CLASS_UNMODIFIABLE_LIST_ALIAS)) {
                javaUtilCollectionsConverter = converter(5, javaType, cls);
            } else if (javaType.hasRawClass(CLASS_UNMODIFIABLE_SET)) {
                javaUtilCollectionsConverter = converter(4, javaType, cls2);
            } else {
                String _findUtilSyncTypeName = _findUtilSyncTypeName(javaType.getRawClass());
                if (_findUtilSyncTypeName.endsWith("Set")) {
                    javaUtilCollectionsConverter = converter(7, javaType, cls2);
                } else if (_findUtilSyncTypeName.endsWith("List")) {
                    javaUtilCollectionsConverter = converter(9, javaType, cls);
                } else if (!_findUtilSyncTypeName.endsWith("Collection")) {
                    return null;
                } else {
                    javaUtilCollectionsConverter = converter(8, javaType, Collection.class);
                }
            }
        }
        return new StdDelegatingDeserializer(javaUtilCollectionsConverter);
    }

    public static JsonDeserializer<?> findForMap(DeserializationContext deserializationContext, JavaType javaType) throws JsonMappingException {
        JavaUtilCollectionsConverter javaUtilCollectionsConverter;
        Class<Map> cls = Map.class;
        if (javaType.hasRawClass(CLASS_SINGLETON_MAP)) {
            javaUtilCollectionsConverter = converter(3, javaType, cls);
        } else if (javaType.hasRawClass(CLASS_UNMODIFIABLE_MAP)) {
            javaUtilCollectionsConverter = converter(6, javaType, cls);
        } else if (!_findUtilSyncTypeName(javaType.getRawClass()).endsWith("Map")) {
            return null;
        } else {
            javaUtilCollectionsConverter = converter(10, javaType, cls);
        }
        return new StdDelegatingDeserializer(javaUtilCollectionsConverter);
    }
}

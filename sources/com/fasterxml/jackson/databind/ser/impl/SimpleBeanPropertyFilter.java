package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SimpleBeanPropertyFilter implements BeanPropertyFilter, PropertyFilter {

    public static class FilterExceptFilter extends SimpleBeanPropertyFilter implements Serializable {
        private static final long serialVersionUID = 1;
        protected final Set<String> _propertiesToInclude;

        public FilterExceptFilter(Set<String> set) {
            this._propertiesToInclude = set;
        }

        public boolean include(BeanPropertyWriter beanPropertyWriter) {
            return this._propertiesToInclude.contains(beanPropertyWriter.getName());
        }

        public boolean include(PropertyWriter propertyWriter) {
            return this._propertiesToInclude.contains(propertyWriter.getName());
        }
    }

    public static class SerializeExceptFilter extends SimpleBeanPropertyFilter implements Serializable {
        static final SerializeExceptFilter INCLUDE_ALL = new SerializeExceptFilter();
        private static final long serialVersionUID = 1;
        protected final Set<String> _propertiesToExclude;

        public SerializeExceptFilter() {
            this._propertiesToExclude = Collections.emptySet();
        }

        public boolean include(BeanPropertyWriter beanPropertyWriter) {
            return !this._propertiesToExclude.contains(beanPropertyWriter.getName());
        }

        public boolean include(PropertyWriter propertyWriter) {
            return !this._propertiesToExclude.contains(propertyWriter.getName());
        }

        public SerializeExceptFilter(Set<String> set) {
            this._propertiesToExclude = set;
        }
    }

    public static SimpleBeanPropertyFilter filterOutAllExcept(Set<String> set) {
        return new FilterExceptFilter(set);
    }

    public static PropertyFilter from(final BeanPropertyFilter beanPropertyFilter) {
        return new PropertyFilter() {
            public void depositSchemaProperty(PropertyWriter propertyWriter, ObjectNode objectNode, SerializerProvider serializerProvider) throws JsonMappingException {
                beanPropertyFilter.depositSchemaProperty((BeanPropertyWriter) propertyWriter, objectNode, serializerProvider);
            }

            public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
                throw new UnsupportedOperationException();
            }

            public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
                beanPropertyFilter.serializeAsField(obj, jsonGenerator, serializerProvider, (BeanPropertyWriter) propertyWriter);
            }

            public void depositSchemaProperty(PropertyWriter propertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
                beanPropertyFilter.depositSchemaProperty((BeanPropertyWriter) propertyWriter, jsonObjectFormatVisitor, serializerProvider);
            }
        };
    }

    public static SimpleBeanPropertyFilter serializeAll() {
        return SerializeExceptFilter.INCLUDE_ALL;
    }

    public static SimpleBeanPropertyFilter serializeAllExcept(Set<String> set) {
        return new SerializeExceptFilter(set);
    }

    @Deprecated
    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, ObjectNode objectNode, SerializerProvider serializerProvider) throws JsonMappingException {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(objectNode, serializerProvider);
        }
    }

    public boolean include(BeanPropertyWriter beanPropertyWriter) {
        return true;
    }

    public boolean includeElement(Object obj) {
        return true;
    }

    public void serializeAsElement(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
        if (includeElement(obj)) {
            propertyWriter.serializeAsElement(obj, jsonGenerator, serializerProvider);
        }
    }

    @Deprecated
    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, BeanPropertyWriter beanPropertyWriter) throws Exception {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
        } else if (!jsonGenerator.canOmitFields()) {
            beanPropertyWriter.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
        }
    }

    public static SimpleBeanPropertyFilter filterOutAllExcept(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new FilterExceptFilter(hashSet);
    }

    @Deprecated
    public static SimpleBeanPropertyFilter serializeAll(Set<String> set) {
        return new FilterExceptFilter(set);
    }

    public static SimpleBeanPropertyFilter serializeAllExcept(String... strArr) {
        HashSet hashSet = new HashSet(strArr.length);
        Collections.addAll(hashSet, strArr);
        return new SerializeExceptFilter(hashSet);
    }

    public boolean include(PropertyWriter propertyWriter) {
        return true;
    }

    @Deprecated
    public void depositSchemaProperty(BeanPropertyWriter beanPropertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
        if (include(beanPropertyWriter)) {
            beanPropertyWriter.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
        }
    }

    @Deprecated
    public void depositSchemaProperty(PropertyWriter propertyWriter, ObjectNode objectNode, SerializerProvider serializerProvider) throws JsonMappingException {
        if (include(propertyWriter)) {
            propertyWriter.depositSchemaProperty(objectNode, serializerProvider);
        }
    }

    public void serializeAsField(Object obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider, PropertyWriter propertyWriter) throws Exception {
        if (include(propertyWriter)) {
            propertyWriter.serializeAsField(obj, jsonGenerator, serializerProvider);
        } else if (!jsonGenerator.canOmitFields()) {
            propertyWriter.serializeAsOmittedField(obj, jsonGenerator, serializerProvider);
        }
    }

    public void depositSchemaProperty(PropertyWriter propertyWriter, JsonObjectFormatVisitor jsonObjectFormatVisitor, SerializerProvider serializerProvider) throws JsonMappingException {
        if (include(propertyWriter)) {
            propertyWriter.depositSchemaProperty(jsonObjectFormatVisitor, serializerProvider);
        }
    }
}

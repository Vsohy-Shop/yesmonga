package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AnnotationIntrospectorPair extends AnnotationIntrospector implements Serializable {
    private static final long serialVersionUID = 1;
    protected final AnnotationIntrospector _primary;
    protected final AnnotationIntrospector _secondary;

    public AnnotationIntrospectorPair(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        this._primary = annotationIntrospector;
        this._secondary = annotationIntrospector2;
    }

    public static AnnotationIntrospector create(AnnotationIntrospector annotationIntrospector, AnnotationIntrospector annotationIntrospector2) {
        return annotationIntrospector == null ? annotationIntrospector2 : annotationIntrospector2 == null ? annotationIntrospector : new AnnotationIntrospectorPair(annotationIntrospector, annotationIntrospector2);
    }

    public Object _explicitClassOrOb(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return null;
        }
        if (!(obj instanceof Class) || !ClassUtil.isBogusClass((Class) obj)) {
            return obj;
        }
        return null;
    }

    public boolean _isExplicitClassOrOb(Object obj, Class<?> cls) {
        if (obj == null || obj == cls) {
            return false;
        }
        if (obj instanceof Class) {
            return !ClassUtil.isBogusClass((Class) obj);
        }
        return true;
    }

    public Collection<AnnotationIntrospector> allIntrospectors() {
        return allIntrospectors(new ArrayList());
    }

    public void findAndAddVirtualProperties(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, List<BeanPropertyWriter> list) {
        this._primary.findAndAddVirtualProperties(mapperConfig, annotatedClass, list);
        this._secondary.findAndAddVirtualProperties(mapperConfig, annotatedClass, list);
    }

    public VisibilityChecker<?> findAutoDetectVisibility(AnnotatedClass annotatedClass, VisibilityChecker<?> visibilityChecker) {
        return this._primary.findAutoDetectVisibility(annotatedClass, this._secondary.findAutoDetectVisibility(annotatedClass, visibilityChecker));
    }

    public String findClassDescription(AnnotatedClass annotatedClass) {
        String findClassDescription = this._primary.findClassDescription(annotatedClass);
        if (findClassDescription == null || findClassDescription.isEmpty()) {
            return this._secondary.findClassDescription(annotatedClass);
        }
        return findClassDescription;
    }

    public Object findContentDeserializer(Annotated annotated) {
        Object findContentDeserializer = this._primary.findContentDeserializer(annotated);
        Class<JsonDeserializer.None> cls = JsonDeserializer.None.class;
        if (_isExplicitClassOrOb(findContentDeserializer, cls)) {
            return findContentDeserializer;
        }
        return _explicitClassOrOb(this._secondary.findContentDeserializer(annotated), cls);
    }

    public Object findContentSerializer(Annotated annotated) {
        Object findContentSerializer = this._primary.findContentSerializer(annotated);
        Class<JsonSerializer.None> cls = JsonSerializer.None.class;
        if (_isExplicitClassOrOb(findContentSerializer, cls)) {
            return findContentSerializer;
        }
        return _explicitClassOrOb(this._secondary.findContentSerializer(annotated), cls);
    }

    public JsonCreator.Mode findCreatorAnnotation(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonCreator.Mode findCreatorAnnotation = this._primary.findCreatorAnnotation(mapperConfig, annotated);
        if (findCreatorAnnotation == null) {
            return this._secondary.findCreatorAnnotation(mapperConfig, annotated);
        }
        return findCreatorAnnotation;
    }

    @Deprecated
    public JsonCreator.Mode findCreatorBinding(Annotated annotated) {
        JsonCreator.Mode findCreatorBinding = this._primary.findCreatorBinding(annotated);
        if (findCreatorBinding != null) {
            return findCreatorBinding;
        }
        return this._secondary.findCreatorBinding(annotated);
    }

    public Enum<?> findDefaultEnumValue(Class<Enum<?>> cls) {
        Enum<?> findDefaultEnumValue = this._primary.findDefaultEnumValue(cls);
        if (findDefaultEnumValue == null) {
            return this._secondary.findDefaultEnumValue(cls);
        }
        return findDefaultEnumValue;
    }

    public Object findDeserializationContentConverter(AnnotatedMember annotatedMember) {
        Object findDeserializationContentConverter = this._primary.findDeserializationContentConverter(annotatedMember);
        if (findDeserializationContentConverter == null) {
            return this._secondary.findDeserializationContentConverter(annotatedMember);
        }
        return findDeserializationContentConverter;
    }

    @Deprecated
    public Class<?> findDeserializationContentType(Annotated annotated, JavaType javaType) {
        Class<?> findDeserializationContentType = this._primary.findDeserializationContentType(annotated, javaType);
        if (findDeserializationContentType == null) {
            return this._secondary.findDeserializationContentType(annotated, javaType);
        }
        return findDeserializationContentType;
    }

    public Object findDeserializationConverter(Annotated annotated) {
        Object findDeserializationConverter = this._primary.findDeserializationConverter(annotated);
        if (findDeserializationConverter == null) {
            return this._secondary.findDeserializationConverter(annotated);
        }
        return findDeserializationConverter;
    }

    @Deprecated
    public Class<?> findDeserializationKeyType(Annotated annotated, JavaType javaType) {
        Class<?> findDeserializationKeyType = this._primary.findDeserializationKeyType(annotated, javaType);
        if (findDeserializationKeyType == null) {
            return this._secondary.findDeserializationKeyType(annotated, javaType);
        }
        return findDeserializationKeyType;
    }

    @Deprecated
    public Class<?> findDeserializationType(Annotated annotated, JavaType javaType) {
        Class<?> findDeserializationType = this._primary.findDeserializationType(annotated, javaType);
        if (findDeserializationType != null) {
            return findDeserializationType;
        }
        return this._secondary.findDeserializationType(annotated, javaType);
    }

    public Object findDeserializer(Annotated annotated) {
        Object findDeserializer = this._primary.findDeserializer(annotated);
        Class<JsonDeserializer.None> cls = JsonDeserializer.None.class;
        if (_isExplicitClassOrOb(findDeserializer, cls)) {
            return findDeserializer;
        }
        return _explicitClassOrOb(this._secondary.findDeserializer(annotated), cls);
    }

    public void findEnumAliases(Class<?> cls, Enum<?>[] enumArr, String[][] strArr) {
        this._secondary.findEnumAliases(cls, enumArr, strArr);
        this._primary.findEnumAliases(cls, enumArr, strArr);
    }

    @Deprecated
    public String findEnumValue(Enum<?> enumR) {
        String findEnumValue = this._primary.findEnumValue(enumR);
        if (findEnumValue == null) {
            return this._secondary.findEnumValue(enumR);
        }
        return findEnumValue;
    }

    public String[] findEnumValues(Class<?> cls, Enum<?>[] enumArr, String[] strArr) {
        return this._primary.findEnumValues(cls, enumArr, this._secondary.findEnumValues(cls, enumArr, strArr));
    }

    public Object findFilterId(Annotated annotated) {
        Object findFilterId = this._primary.findFilterId(annotated);
        if (findFilterId == null) {
            return this._secondary.findFilterId(annotated);
        }
        return findFilterId;
    }

    public JsonFormat.Value findFormat(Annotated annotated) {
        JsonFormat.Value findFormat = this._primary.findFormat(annotated);
        JsonFormat.Value findFormat2 = this._secondary.findFormat(annotated);
        if (findFormat2 == null) {
            return findFormat;
        }
        return findFormat2.withOverrides(findFormat);
    }

    @Deprecated
    public Boolean findIgnoreUnknownProperties(AnnotatedClass annotatedClass) {
        Boolean findIgnoreUnknownProperties = this._primary.findIgnoreUnknownProperties(annotatedClass);
        if (findIgnoreUnknownProperties == null) {
            return this._secondary.findIgnoreUnknownProperties(annotatedClass);
        }
        return findIgnoreUnknownProperties;
    }

    public String findImplicitPropertyName(AnnotatedMember annotatedMember) {
        String findImplicitPropertyName = this._primary.findImplicitPropertyName(annotatedMember);
        if (findImplicitPropertyName == null) {
            return this._secondary.findImplicitPropertyName(annotatedMember);
        }
        return findImplicitPropertyName;
    }

    public JacksonInject.Value findInjectableValue(AnnotatedMember annotatedMember) {
        JacksonInject.Value findInjectableValue;
        JacksonInject.Value findInjectableValue2 = this._primary.findInjectableValue(annotatedMember);
        if ((findInjectableValue2 != null && findInjectableValue2.getUseInput() != null) || (findInjectableValue = this._secondary.findInjectableValue(annotatedMember)) == null) {
            return findInjectableValue2;
        }
        if (findInjectableValue2 != null) {
            findInjectableValue = findInjectableValue2.withUseInput(findInjectableValue.getUseInput());
        }
        return findInjectableValue;
    }

    @Deprecated
    public Object findInjectableValueId(AnnotatedMember annotatedMember) {
        Object findInjectableValueId = this._primary.findInjectableValueId(annotatedMember);
        if (findInjectableValueId == null) {
            return this._secondary.findInjectableValueId(annotatedMember);
        }
        return findInjectableValueId;
    }

    public Object findKeyDeserializer(Annotated annotated) {
        Object findKeyDeserializer = this._primary.findKeyDeserializer(annotated);
        Class<KeyDeserializer.None> cls = KeyDeserializer.None.class;
        if (_isExplicitClassOrOb(findKeyDeserializer, cls)) {
            return findKeyDeserializer;
        }
        return _explicitClassOrOb(this._secondary.findKeyDeserializer(annotated), cls);
    }

    public Object findKeySerializer(Annotated annotated) {
        Object findKeySerializer = this._primary.findKeySerializer(annotated);
        Class<JsonSerializer.None> cls = JsonSerializer.None.class;
        if (_isExplicitClassOrOb(findKeySerializer, cls)) {
            return findKeySerializer;
        }
        return _explicitClassOrOb(this._secondary.findKeySerializer(annotated), cls);
    }

    public Boolean findMergeInfo(Annotated annotated) {
        Boolean findMergeInfo = this._primary.findMergeInfo(annotated);
        if (findMergeInfo == null) {
            return this._secondary.findMergeInfo(annotated);
        }
        return findMergeInfo;
    }

    public PropertyName findNameForDeserialization(Annotated annotated) {
        PropertyName findNameForDeserialization;
        PropertyName findNameForDeserialization2 = this._primary.findNameForDeserialization(annotated);
        if (findNameForDeserialization2 == null) {
            return this._secondary.findNameForDeserialization(annotated);
        }
        if (findNameForDeserialization2 != PropertyName.USE_DEFAULT || (findNameForDeserialization = this._secondary.findNameForDeserialization(annotated)) == null) {
            return findNameForDeserialization2;
        }
        return findNameForDeserialization;
    }

    public PropertyName findNameForSerialization(Annotated annotated) {
        PropertyName findNameForSerialization;
        PropertyName findNameForSerialization2 = this._primary.findNameForSerialization(annotated);
        if (findNameForSerialization2 == null) {
            return this._secondary.findNameForSerialization(annotated);
        }
        if (findNameForSerialization2 != PropertyName.USE_DEFAULT || (findNameForSerialization = this._secondary.findNameForSerialization(annotated)) == null) {
            return findNameForSerialization2;
        }
        return findNameForSerialization;
    }

    public Object findNamingStrategy(AnnotatedClass annotatedClass) {
        Object findNamingStrategy = this._primary.findNamingStrategy(annotatedClass);
        if (findNamingStrategy == null) {
            return this._secondary.findNamingStrategy(annotatedClass);
        }
        return findNamingStrategy;
    }

    public Object findNullSerializer(Annotated annotated) {
        Object findNullSerializer = this._primary.findNullSerializer(annotated);
        Class<JsonSerializer.None> cls = JsonSerializer.None.class;
        if (_isExplicitClassOrOb(findNullSerializer, cls)) {
            return findNullSerializer;
        }
        return _explicitClassOrOb(this._secondary.findNullSerializer(annotated), cls);
    }

    public ObjectIdInfo findObjectIdInfo(Annotated annotated) {
        ObjectIdInfo findObjectIdInfo = this._primary.findObjectIdInfo(annotated);
        if (findObjectIdInfo == null) {
            return this._secondary.findObjectIdInfo(annotated);
        }
        return findObjectIdInfo;
    }

    public ObjectIdInfo findObjectReferenceInfo(Annotated annotated, ObjectIdInfo objectIdInfo) {
        return this._primary.findObjectReferenceInfo(annotated, this._secondary.findObjectReferenceInfo(annotated, objectIdInfo));
    }

    public Class<?> findPOJOBuilder(AnnotatedClass annotatedClass) {
        Class<?> findPOJOBuilder = this._primary.findPOJOBuilder(annotatedClass);
        if (findPOJOBuilder == null) {
            return this._secondary.findPOJOBuilder(annotatedClass);
        }
        return findPOJOBuilder;
    }

    public JsonPOJOBuilder.Value findPOJOBuilderConfig(AnnotatedClass annotatedClass) {
        JsonPOJOBuilder.Value findPOJOBuilderConfig = this._primary.findPOJOBuilderConfig(annotatedClass);
        if (findPOJOBuilderConfig == null) {
            return this._secondary.findPOJOBuilderConfig(annotatedClass);
        }
        return findPOJOBuilderConfig;
    }

    @Deprecated
    public String[] findPropertiesToIgnore(Annotated annotated, boolean z) {
        String[] findPropertiesToIgnore = this._primary.findPropertiesToIgnore(annotated, z);
        if (findPropertiesToIgnore == null) {
            return this._secondary.findPropertiesToIgnore(annotated, z);
        }
        return findPropertiesToIgnore;
    }

    public JsonProperty.Access findPropertyAccess(Annotated annotated) {
        JsonProperty.Access findPropertyAccess = this._primary.findPropertyAccess(annotated);
        if (findPropertyAccess != null && findPropertyAccess != JsonProperty.Access.AUTO) {
            return findPropertyAccess;
        }
        JsonProperty.Access findPropertyAccess2 = this._secondary.findPropertyAccess(annotated);
        if (findPropertyAccess2 != null) {
            return findPropertyAccess2;
        }
        return JsonProperty.Access.AUTO;
    }

    public List<PropertyName> findPropertyAliases(Annotated annotated) {
        List<PropertyName> findPropertyAliases = this._primary.findPropertyAliases(annotated);
        if (findPropertyAliases == null) {
            return this._secondary.findPropertyAliases(annotated);
        }
        return findPropertyAliases;
    }

    public TypeResolverBuilder<?> findPropertyContentTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        TypeResolverBuilder<?> findPropertyContentTypeResolver = this._primary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType);
        if (findPropertyContentTypeResolver == null) {
            return this._secondary.findPropertyContentTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        return findPropertyContentTypeResolver;
    }

    public String findPropertyDefaultValue(Annotated annotated) {
        String findPropertyDefaultValue = this._primary.findPropertyDefaultValue(annotated);
        if (findPropertyDefaultValue == null || findPropertyDefaultValue.isEmpty()) {
            return this._secondary.findPropertyDefaultValue(annotated);
        }
        return findPropertyDefaultValue;
    }

    public String findPropertyDescription(Annotated annotated) {
        String findPropertyDescription = this._primary.findPropertyDescription(annotated);
        if (findPropertyDescription == null) {
            return this._secondary.findPropertyDescription(annotated);
        }
        return findPropertyDescription;
    }

    public JsonIgnoreProperties.Value findPropertyIgnoralByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonIgnoreProperties.Value findPropertyIgnoralByName = this._secondary.findPropertyIgnoralByName(mapperConfig, annotated);
        JsonIgnoreProperties.Value findPropertyIgnoralByName2 = this._primary.findPropertyIgnoralByName(mapperConfig, annotated);
        if (findPropertyIgnoralByName == null) {
            return findPropertyIgnoralByName2;
        }
        return findPropertyIgnoralByName.withOverrides(findPropertyIgnoralByName2);
    }

    @Deprecated
    public JsonIgnoreProperties.Value findPropertyIgnorals(Annotated annotated) {
        JsonIgnoreProperties.Value findPropertyIgnorals = this._secondary.findPropertyIgnorals(annotated);
        JsonIgnoreProperties.Value findPropertyIgnorals2 = this._primary.findPropertyIgnorals(annotated);
        if (findPropertyIgnorals == null) {
            return findPropertyIgnorals2;
        }
        return findPropertyIgnorals.withOverrides(findPropertyIgnorals2);
    }

    public JsonInclude.Value findPropertyInclusion(Annotated annotated) {
        JsonInclude.Value findPropertyInclusion = this._secondary.findPropertyInclusion(annotated);
        JsonInclude.Value findPropertyInclusion2 = this._primary.findPropertyInclusion(annotated);
        if (findPropertyInclusion == null) {
            return findPropertyInclusion2;
        }
        return findPropertyInclusion.withOverrides(findPropertyInclusion2);
    }

    public JsonIncludeProperties.Value findPropertyInclusionByName(MapperConfig<?> mapperConfig, Annotated annotated) {
        JsonIncludeProperties.Value findPropertyInclusionByName = this._secondary.findPropertyInclusionByName(mapperConfig, annotated);
        JsonIncludeProperties.Value findPropertyInclusionByName2 = this._primary.findPropertyInclusionByName(mapperConfig, annotated);
        if (findPropertyInclusionByName == null) {
            return findPropertyInclusionByName2;
        }
        return findPropertyInclusionByName.withOverrides(findPropertyInclusionByName2);
    }

    public Integer findPropertyIndex(Annotated annotated) {
        Integer findPropertyIndex = this._primary.findPropertyIndex(annotated);
        if (findPropertyIndex == null) {
            return this._secondary.findPropertyIndex(annotated);
        }
        return findPropertyIndex;
    }

    public TypeResolverBuilder<?> findPropertyTypeResolver(MapperConfig<?> mapperConfig, AnnotatedMember annotatedMember, JavaType javaType) {
        TypeResolverBuilder<?> findPropertyTypeResolver = this._primary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType);
        if (findPropertyTypeResolver == null) {
            return this._secondary.findPropertyTypeResolver(mapperConfig, annotatedMember, javaType);
        }
        return findPropertyTypeResolver;
    }

    public AnnotationIntrospector.ReferenceProperty findReferenceType(AnnotatedMember annotatedMember) {
        AnnotationIntrospector.ReferenceProperty findReferenceType = this._primary.findReferenceType(annotatedMember);
        if (findReferenceType == null) {
            return this._secondary.findReferenceType(annotatedMember);
        }
        return findReferenceType;
    }

    public PropertyName findRenameByField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, PropertyName propertyName) {
        PropertyName findRenameByField = this._secondary.findRenameByField(mapperConfig, annotatedField, propertyName);
        if (findRenameByField == null) {
            return this._primary.findRenameByField(mapperConfig, annotatedField, propertyName);
        }
        return findRenameByField;
    }

    public PropertyName findRootName(AnnotatedClass annotatedClass) {
        PropertyName findRootName;
        PropertyName findRootName2 = this._primary.findRootName(annotatedClass);
        if (findRootName2 == null) {
            return this._secondary.findRootName(annotatedClass);
        }
        if (!findRootName2.hasSimpleName() && (findRootName = this._secondary.findRootName(annotatedClass)) != null) {
            return findRootName;
        }
        return findRootName2;
    }

    public Object findSerializationContentConverter(AnnotatedMember annotatedMember) {
        Object findSerializationContentConverter = this._primary.findSerializationContentConverter(annotatedMember);
        if (findSerializationContentConverter == null) {
            return this._secondary.findSerializationContentConverter(annotatedMember);
        }
        return findSerializationContentConverter;
    }

    @Deprecated
    public Class<?> findSerializationContentType(Annotated annotated, JavaType javaType) {
        Class<?> findSerializationContentType = this._primary.findSerializationContentType(annotated, javaType);
        if (findSerializationContentType == null) {
            return this._secondary.findSerializationContentType(annotated, javaType);
        }
        return findSerializationContentType;
    }

    public Object findSerializationConverter(Annotated annotated) {
        Object findSerializationConverter = this._primary.findSerializationConverter(annotated);
        if (findSerializationConverter == null) {
            return this._secondary.findSerializationConverter(annotated);
        }
        return findSerializationConverter;
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusion(Annotated annotated, JsonInclude.Include include) {
        return this._primary.findSerializationInclusion(annotated, this._secondary.findSerializationInclusion(annotated, include));
    }

    @Deprecated
    public JsonInclude.Include findSerializationInclusionForContent(Annotated annotated, JsonInclude.Include include) {
        return this._primary.findSerializationInclusionForContent(annotated, this._secondary.findSerializationInclusionForContent(annotated, include));
    }

    @Deprecated
    public Class<?> findSerializationKeyType(Annotated annotated, JavaType javaType) {
        Class<?> findSerializationKeyType = this._primary.findSerializationKeyType(annotated, javaType);
        if (findSerializationKeyType == null) {
            return this._secondary.findSerializationKeyType(annotated, javaType);
        }
        return findSerializationKeyType;
    }

    public String[] findSerializationPropertyOrder(AnnotatedClass annotatedClass) {
        String[] findSerializationPropertyOrder = this._primary.findSerializationPropertyOrder(annotatedClass);
        if (findSerializationPropertyOrder == null) {
            return this._secondary.findSerializationPropertyOrder(annotatedClass);
        }
        return findSerializationPropertyOrder;
    }

    public Boolean findSerializationSortAlphabetically(Annotated annotated) {
        Boolean findSerializationSortAlphabetically = this._primary.findSerializationSortAlphabetically(annotated);
        if (findSerializationSortAlphabetically == null) {
            return this._secondary.findSerializationSortAlphabetically(annotated);
        }
        return findSerializationSortAlphabetically;
    }

    @Deprecated
    public Class<?> findSerializationType(Annotated annotated) {
        Class<?> findSerializationType = this._primary.findSerializationType(annotated);
        if (findSerializationType == null) {
            return this._secondary.findSerializationType(annotated);
        }
        return findSerializationType;
    }

    public JsonSerialize.Typing findSerializationTyping(Annotated annotated) {
        JsonSerialize.Typing findSerializationTyping = this._primary.findSerializationTyping(annotated);
        if (findSerializationTyping == null) {
            return this._secondary.findSerializationTyping(annotated);
        }
        return findSerializationTyping;
    }

    public Object findSerializer(Annotated annotated) {
        Object findSerializer = this._primary.findSerializer(annotated);
        Class<JsonSerializer.None> cls = JsonSerializer.None.class;
        if (_isExplicitClassOrOb(findSerializer, cls)) {
            return findSerializer;
        }
        return _explicitClassOrOb(this._secondary.findSerializer(annotated), cls);
    }

    public JsonSetter.Value findSetterInfo(Annotated annotated) {
        JsonSetter.Value findSetterInfo = this._secondary.findSetterInfo(annotated);
        JsonSetter.Value findSetterInfo2 = this._primary.findSetterInfo(annotated);
        if (findSetterInfo == null) {
            return findSetterInfo2;
        }
        return findSetterInfo.withOverrides(findSetterInfo2);
    }

    public List<NamedType> findSubtypes(Annotated annotated) {
        List<NamedType> findSubtypes = this._primary.findSubtypes(annotated);
        List<NamedType> findSubtypes2 = this._secondary.findSubtypes(annotated);
        if (findSubtypes == null || findSubtypes.isEmpty()) {
            return findSubtypes2;
        }
        if (findSubtypes2 == null || findSubtypes2.isEmpty()) {
            return findSubtypes;
        }
        ArrayList arrayList = new ArrayList(findSubtypes.size() + findSubtypes2.size());
        arrayList.addAll(findSubtypes);
        arrayList.addAll(findSubtypes2);
        return arrayList;
    }

    public String findTypeName(AnnotatedClass annotatedClass) {
        String findTypeName = this._primary.findTypeName(annotatedClass);
        if (findTypeName == null || findTypeName.isEmpty()) {
            return this._secondary.findTypeName(annotatedClass);
        }
        return findTypeName;
    }

    public TypeResolverBuilder<?> findTypeResolver(MapperConfig<?> mapperConfig, AnnotatedClass annotatedClass, JavaType javaType) {
        TypeResolverBuilder<?> findTypeResolver = this._primary.findTypeResolver(mapperConfig, annotatedClass, javaType);
        if (findTypeResolver == null) {
            return this._secondary.findTypeResolver(mapperConfig, annotatedClass, javaType);
        }
        return findTypeResolver;
    }

    public NameTransformer findUnwrappingNameTransformer(AnnotatedMember annotatedMember) {
        NameTransformer findUnwrappingNameTransformer = this._primary.findUnwrappingNameTransformer(annotatedMember);
        if (findUnwrappingNameTransformer == null) {
            return this._secondary.findUnwrappingNameTransformer(annotatedMember);
        }
        return findUnwrappingNameTransformer;
    }

    public Object findValueInstantiator(AnnotatedClass annotatedClass) {
        Object findValueInstantiator = this._primary.findValueInstantiator(annotatedClass);
        if (findValueInstantiator == null) {
            return this._secondary.findValueInstantiator(annotatedClass);
        }
        return findValueInstantiator;
    }

    public Class<?>[] findViews(Annotated annotated) {
        Class<?>[] findViews = this._primary.findViews(annotated);
        if (findViews == null) {
            return this._secondary.findViews(annotated);
        }
        return findViews;
    }

    public PropertyName findWrapperName(Annotated annotated) {
        PropertyName findWrapperName;
        PropertyName findWrapperName2 = this._primary.findWrapperName(annotated);
        if (findWrapperName2 == null) {
            return this._secondary.findWrapperName(annotated);
        }
        if (findWrapperName2 != PropertyName.USE_DEFAULT || (findWrapperName = this._secondary.findWrapperName(annotated)) == null) {
            return findWrapperName2;
        }
        return findWrapperName;
    }

    public Boolean hasAnyGetter(Annotated annotated) {
        Boolean hasAnyGetter = this._primary.hasAnyGetter(annotated);
        if (hasAnyGetter == null) {
            return this._secondary.hasAnyGetter(annotated);
        }
        return hasAnyGetter;
    }

    @Deprecated
    public boolean hasAnyGetterAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAnyGetterAnnotation(annotatedMethod) || this._secondary.hasAnyGetterAnnotation(annotatedMethod);
    }

    public Boolean hasAnySetter(Annotated annotated) {
        Boolean hasAnySetter = this._primary.hasAnySetter(annotated);
        if (hasAnySetter == null) {
            return this._secondary.hasAnySetter(annotated);
        }
        return hasAnySetter;
    }

    @Deprecated
    public boolean hasAnySetterAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAnySetterAnnotation(annotatedMethod) || this._secondary.hasAnySetterAnnotation(annotatedMethod);
    }

    public Boolean hasAsKey(MapperConfig<?> mapperConfig, Annotated annotated) {
        Boolean hasAsKey = this._primary.hasAsKey(mapperConfig, annotated);
        if (hasAsKey == null) {
            return this._secondary.hasAsKey(mapperConfig, annotated);
        }
        return hasAsKey;
    }

    public Boolean hasAsValue(Annotated annotated) {
        Boolean hasAsValue = this._primary.hasAsValue(annotated);
        if (hasAsValue == null) {
            return this._secondary.hasAsValue(annotated);
        }
        return hasAsValue;
    }

    @Deprecated
    public boolean hasAsValueAnnotation(AnnotatedMethod annotatedMethod) {
        return this._primary.hasAsValueAnnotation(annotatedMethod) || this._secondary.hasAsValueAnnotation(annotatedMethod);
    }

    @Deprecated
    public boolean hasCreatorAnnotation(Annotated annotated) {
        return this._primary.hasCreatorAnnotation(annotated) || this._secondary.hasCreatorAnnotation(annotated);
    }

    public boolean hasIgnoreMarker(AnnotatedMember annotatedMember) {
        return this._primary.hasIgnoreMarker(annotatedMember) || this._secondary.hasIgnoreMarker(annotatedMember);
    }

    public Boolean hasRequiredMarker(AnnotatedMember annotatedMember) {
        Boolean hasRequiredMarker = this._primary.hasRequiredMarker(annotatedMember);
        if (hasRequiredMarker == null) {
            return this._secondary.hasRequiredMarker(annotatedMember);
        }
        return hasRequiredMarker;
    }

    public boolean isAnnotationBundle(Annotation annotation) {
        return this._primary.isAnnotationBundle(annotation) || this._secondary.isAnnotationBundle(annotation);
    }

    public Boolean isIgnorableType(AnnotatedClass annotatedClass) {
        Boolean isIgnorableType = this._primary.isIgnorableType(annotatedClass);
        if (isIgnorableType == null) {
            return this._secondary.isIgnorableType(annotatedClass);
        }
        return isIgnorableType;
    }

    public Boolean isTypeId(AnnotatedMember annotatedMember) {
        Boolean isTypeId = this._primary.isTypeId(annotatedMember);
        if (isTypeId == null) {
            return this._secondary.isTypeId(annotatedMember);
        }
        return isTypeId;
    }

    public JavaType refineDeserializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        return this._primary.refineDeserializationType(mapperConfig, annotated, this._secondary.refineDeserializationType(mapperConfig, annotated, javaType));
    }

    public JavaType refineSerializationType(MapperConfig<?> mapperConfig, Annotated annotated, JavaType javaType) throws JsonMappingException {
        return this._primary.refineSerializationType(mapperConfig, annotated, this._secondary.refineSerializationType(mapperConfig, annotated, javaType));
    }

    public AnnotatedMethod resolveSetterConflict(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, AnnotatedMethod annotatedMethod2) {
        AnnotatedMethod resolveSetterConflict = this._primary.resolveSetterConflict(mapperConfig, annotatedMethod, annotatedMethod2);
        if (resolveSetterConflict == null) {
            return this._secondary.resolveSetterConflict(mapperConfig, annotatedMethod, annotatedMethod2);
        }
        return resolveSetterConflict;
    }

    public Version version() {
        return this._primary.version();
    }

    public Collection<AnnotationIntrospector> allIntrospectors(Collection<AnnotationIntrospector> collection) {
        this._primary.allIntrospectors(collection);
        this._secondary.allIntrospectors(collection);
        return collection;
    }
}

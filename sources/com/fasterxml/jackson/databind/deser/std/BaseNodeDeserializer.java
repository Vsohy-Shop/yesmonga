package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.type.LogicalType;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.IOException;

abstract class BaseNodeDeserializer<T extends JsonNode> extends StdDeserializer<T> {
    protected final Boolean _supportsUpdates;

    public BaseNodeDeserializer(Class<T> cls, Boolean bool) {
        super((Class<?>) cls);
        this._supportsUpdates = bool;
    }

    public final JsonNode _fromEmbedded(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        Object embeddedObject = jsonParser.getEmbeddedObject();
        if (embeddedObject == null) {
            return jsonNodeFactory.nullNode();
        }
        if (embeddedObject.getClass() == byte[].class) {
            return jsonNodeFactory.binaryNode((byte[]) embeddedObject);
        }
        if (embeddedObject instanceof RawValue) {
            return jsonNodeFactory.rawValueNode((RawValue) embeddedObject);
        }
        if (embeddedObject instanceof JsonNode) {
            return (JsonNode) embeddedObject;
        }
        return jsonNodeFactory.pojoNode(embeddedObject);
    }

    public final JsonNode _fromFloat(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType numberType = jsonParser.getNumberType();
        if (numberType == JsonParser.NumberType.BIG_DECIMAL) {
            return jsonNodeFactory.numberNode(jsonParser.getDecimalValue());
        }
        if (deserializationContext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS)) {
            if (jsonParser.isNaN()) {
                return jsonNodeFactory.numberNode(jsonParser.getDoubleValue());
            }
            return jsonNodeFactory.numberNode(jsonParser.getDecimalValue());
        } else if (numberType == JsonParser.NumberType.FLOAT) {
            return jsonNodeFactory.numberNode(jsonParser.getFloatValue());
        } else {
            return jsonNodeFactory.numberNode(jsonParser.getDoubleValue());
        }
    }

    public final JsonNode _fromInt(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonParser.NumberType numberType;
        int deserializationFeatures = deserializationContext.getDeserializationFeatures();
        if ((StdDeserializer.F_MASK_INT_COERCIONS & deserializationFeatures) == 0) {
            numberType = jsonParser.getNumberType();
        } else if (DeserializationFeature.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures)) {
            numberType = JsonParser.NumberType.BIG_INTEGER;
        } else if (DeserializationFeature.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures)) {
            numberType = JsonParser.NumberType.LONG;
        } else {
            numberType = jsonParser.getNumberType();
        }
        if (numberType == JsonParser.NumberType.INT) {
            return jsonNodeFactory.numberNode(jsonParser.getIntValue());
        }
        if (numberType == JsonParser.NumberType.LONG) {
            return jsonNodeFactory.numberNode(jsonParser.getLongValue());
        }
        return jsonNodeFactory.numberNode(jsonParser.getBigIntegerValue());
    }

    public void _handleDuplicateField(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory, String str, ObjectNode objectNode, JsonNode jsonNode, JsonNode jsonNode2) throws JsonProcessingException {
        if (deserializationContext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY)) {
            deserializationContext.reportInputMismatch((Class<?>) JsonNode.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
        if (!deserializationContext.isEnabled(StreamReadCapability.DUPLICATE_PROPERTIES)) {
            return;
        }
        if (jsonNode.isArray()) {
            ((ArrayNode) jsonNode).add(jsonNode2);
            objectNode.replace(str, jsonNode);
            return;
        }
        ArrayNode arrayNode = jsonNodeFactory.arrayNode();
        arrayNode.add(jsonNode);
        arrayNode.add(jsonNode2);
        objectNode.replace(str, arrayNode);
    }

    public final JsonNode deserializeAny(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        int currentTokenId = jsonParser.currentTokenId();
        if (currentTokenId == 2) {
            return jsonNodeFactory.objectNode();
        }
        switch (currentTokenId) {
            case 5:
                return deserializeObjectAtName(jsonParser, deserializationContext, jsonNodeFactory);
            case 6:
                return jsonNodeFactory.textNode(jsonParser.getText());
            case 7:
                return _fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            case 8:
                return _fromFloat(jsonParser, deserializationContext, jsonNodeFactory);
            case 9:
                return jsonNodeFactory.booleanNode(true);
            case 10:
                return jsonNodeFactory.booleanNode(false);
            case 11:
                return jsonNodeFactory.nullNode();
            case 12:
                return _fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory);
            default:
                return (JsonNode) deserializationContext.handleUnexpectedToken(handledType(), jsonParser);
        }
    }

    public final ArrayNode deserializeArray(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        ArrayNode arrayNode = jsonNodeFactory.arrayNode();
        while (true) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken != null) {
                switch (nextToken.mo37695id()) {
                    case 1:
                        arrayNode.add((JsonNode) deserializeObject(jsonParser, deserializationContext, jsonNodeFactory));
                        break;
                    case 3:
                        arrayNode.add((JsonNode) deserializeArray(jsonParser, deserializationContext, jsonNodeFactory));
                        break;
                    case 4:
                        return arrayNode;
                    case 6:
                        arrayNode.add((JsonNode) jsonNodeFactory.textNode(jsonParser.getText()));
                        break;
                    case 7:
                        arrayNode.add(_fromInt(jsonParser, deserializationContext, jsonNodeFactory));
                        break;
                    case 9:
                        arrayNode.add((JsonNode) jsonNodeFactory.booleanNode(true));
                        break;
                    case 10:
                        arrayNode.add((JsonNode) jsonNodeFactory.booleanNode(false));
                        break;
                    case 11:
                        arrayNode.add((JsonNode) jsonNodeFactory.nullNode());
                        break;
                    case 12:
                        arrayNode.add(_fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory));
                        break;
                    default:
                        arrayNode.add(deserializeAny(jsonParser, deserializationContext, jsonNodeFactory));
                        break;
                }
            } else {
                return arrayNode;
            }
        }
    }

    public final ObjectNode deserializeObject(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonNode jsonNode;
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        String nextFieldName = jsonParser.nextFieldName();
        while (nextFieldName != null) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            int id = nextToken.mo37695id();
            if (id == 1) {
                jsonNode = deserializeObject(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 3) {
                jsonNode = deserializeArray(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 6) {
                jsonNode = jsonNodeFactory.textNode(jsonParser.getText());
            } else if (id != 7) {
                switch (id) {
                    case 9:
                        jsonNode = jsonNodeFactory.booleanNode(true);
                        break;
                    case 10:
                        jsonNode = jsonNodeFactory.booleanNode(false);
                        break;
                    case 11:
                        jsonNode = jsonNodeFactory.nullNode();
                        break;
                    case 12:
                        jsonNode = _fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                    default:
                        jsonNode = deserializeAny(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            } else {
                jsonNode = _fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            }
            JsonNode jsonNode2 = jsonNode;
            JsonNode replace = objectNode.replace(nextFieldName, jsonNode2);
            if (replace != null) {
                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, nextFieldName, objectNode, replace, jsonNode2);
            }
            nextFieldName = jsonParser.nextFieldName();
        }
        return objectNode;
    }

    public final ObjectNode deserializeObjectAtName(JsonParser jsonParser, DeserializationContext deserializationContext, JsonNodeFactory jsonNodeFactory) throws IOException {
        JsonNode jsonNode;
        ObjectNode objectNode = jsonNodeFactory.objectNode();
        String currentName = jsonParser.currentName();
        while (currentName != null) {
            JsonToken nextToken = jsonParser.nextToken();
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            int id = nextToken.mo37695id();
            if (id == 1) {
                jsonNode = deserializeObject(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 3) {
                jsonNode = deserializeArray(jsonParser, deserializationContext, jsonNodeFactory);
            } else if (id == 6) {
                jsonNode = jsonNodeFactory.textNode(jsonParser.getText());
            } else if (id != 7) {
                switch (id) {
                    case 9:
                        jsonNode = jsonNodeFactory.booleanNode(true);
                        break;
                    case 10:
                        jsonNode = jsonNodeFactory.booleanNode(false);
                        break;
                    case 11:
                        jsonNode = jsonNodeFactory.nullNode();
                        break;
                    case 12:
                        jsonNode = _fromEmbedded(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                    default:
                        jsonNode = deserializeAny(jsonParser, deserializationContext, jsonNodeFactory);
                        break;
                }
            } else {
                jsonNode = _fromInt(jsonParser, deserializationContext, jsonNodeFactory);
            }
            JsonNode jsonNode2 = jsonNode;
            JsonNode replace = objectNode.replace(currentName, jsonNode2);
            if (replace != null) {
                _handleDuplicateField(jsonParser, deserializationContext, jsonNodeFactory, currentName, objectNode, replace, jsonNode2);
            }
            currentName = jsonParser.nextFieldName();
        }
        return objectNode;
    }

    public Object deserializeWithType(JsonParser jsonParser, DeserializationContext deserializationContext, TypeDeserializer typeDeserializer) throws IOException {
        return typeDeserializer.deserializeTypedFromAny(jsonParser, deserializationContext);
    }

    public boolean isCachable() {
        return true;
    }

    public LogicalType logicalType() {
        return LogicalType.Untyped;
    }

    public Boolean supportsUpdate(DeserializationConfig deserializationConfig) {
        return this._supportsUpdates;
    }

    public final JsonNode updateArray(JsonParser jsonParser, DeserializationContext deserializationContext, ArrayNode arrayNode) throws IOException {
        JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
        while (true) {
            switch (jsonParser.nextToken().mo37695id()) {
                case 1:
                    arrayNode.add((JsonNode) deserializeObject(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 3:
                    arrayNode.add((JsonNode) deserializeArray(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 4:
                    return arrayNode;
                case 6:
                    arrayNode.add((JsonNode) nodeFactory.textNode(jsonParser.getText()));
                    break;
                case 7:
                    arrayNode.add(_fromInt(jsonParser, deserializationContext, nodeFactory));
                    break;
                case 9:
                    arrayNode.add((JsonNode) nodeFactory.booleanNode(true));
                    break;
                case 10:
                    arrayNode.add((JsonNode) nodeFactory.booleanNode(false));
                    break;
                case 11:
                    arrayNode.add((JsonNode) nodeFactory.nullNode());
                    break;
                case 12:
                    arrayNode.add(_fromEmbedded(jsonParser, deserializationContext, nodeFactory));
                    break;
                default:
                    arrayNode.add(deserializeAny(jsonParser, deserializationContext, nodeFactory));
                    break;
            }
        }
    }

    public final JsonNode updateObject(JsonParser jsonParser, DeserializationContext deserializationContext, ObjectNode objectNode) throws IOException {
        String str;
        JsonNode jsonNode;
        if (jsonParser.isExpectedStartObjectToken()) {
            str = jsonParser.nextFieldName();
        } else if (!jsonParser.hasToken(JsonToken.FIELD_NAME)) {
            return (JsonNode) deserialize(jsonParser, deserializationContext);
        } else {
            str = jsonParser.currentName();
        }
        while (str != null) {
            JsonToken nextToken = jsonParser.nextToken();
            JsonNode jsonNode2 = objectNode.get(str);
            if (jsonNode2 != null) {
                if (jsonNode2 instanceof ObjectNode) {
                    if (nextToken == JsonToken.START_OBJECT) {
                        JsonNode updateObject = updateObject(jsonParser, deserializationContext, (ObjectNode) jsonNode2);
                        if (updateObject != jsonNode2) {
                            objectNode.set(str, updateObject);
                        }
                        str = jsonParser.nextFieldName();
                    }
                } else if ((jsonNode2 instanceof ArrayNode) && nextToken == JsonToken.START_ARRAY) {
                    JsonNode updateArray = updateArray(jsonParser, deserializationContext, (ArrayNode) jsonNode2);
                    if (updateArray != jsonNode2) {
                        objectNode.set(str, updateArray);
                    }
                    str = jsonParser.nextFieldName();
                }
            }
            if (nextToken == null) {
                nextToken = JsonToken.NOT_AVAILABLE;
            }
            JsonNodeFactory nodeFactory = deserializationContext.getNodeFactory();
            int id = nextToken.mo37695id();
            if (id == 1) {
                jsonNode = deserializeObject(jsonParser, deserializationContext, nodeFactory);
            } else if (id == 3) {
                jsonNode = deserializeArray(jsonParser, deserializationContext, nodeFactory);
            } else if (id == 6) {
                jsonNode = nodeFactory.textNode(jsonParser.getText());
            } else if (id != 7) {
                switch (id) {
                    case 9:
                        jsonNode = nodeFactory.booleanNode(true);
                        break;
                    case 10:
                        jsonNode = nodeFactory.booleanNode(false);
                        break;
                    case 11:
                        jsonNode = nodeFactory.nullNode();
                        break;
                    case 12:
                        jsonNode = _fromEmbedded(jsonParser, deserializationContext, nodeFactory);
                        break;
                    default:
                        jsonNode = deserializeAny(jsonParser, deserializationContext, nodeFactory);
                        break;
                }
            } else {
                jsonNode = _fromInt(jsonParser, deserializationContext, nodeFactory);
            }
            objectNode.set(str, jsonNode);
            str = jsonParser.nextFieldName();
        }
        return objectNode;
    }
}

/*
 * Copyright (c) 2019, the Dart project authors. Please see the AUTHORS file
 * for details. All rights reserved. Use of this source code is governed by a
 * BSD-style license that can be found in the LICENSE file.
 *
 * This file has been automatically generated. Please do not edit it manually.
 * To regenerate the file, use the script "pkg/analysis_server/tool/spec/generate_files".
 */
package org.dartlang.analysis.server.protocol;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import com.google.dart.server.utilities.general.JsonUtilities;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

/**
 * @coverage dart.server.generated.types
 */
@SuppressWarnings("unused")
public class ExtractLocalVariableFeedback extends RefactoringFeedback {

  public static final List<ExtractLocalVariableFeedback> EMPTY_LIST = List.of();

  /**
   * The offsets of the expressions that cover the specified selection, from the down most to the up
   * most.
   */
  private final int[] coveringExpressionOffsets;

  /**
   * The lengths of the expressions that cover the specified selection, from the down most to the up
   * most.
   */
  private final int[] coveringExpressionLengths;

  /**
   * The proposed names for the local variable.
   */
  private final List<String> names;

  /**
   * The offsets of the expressions that would be replaced by a reference to the variable.
   */
  private final int[] offsets;

  /**
   * The lengths of the expressions that would be replaced by a reference to the variable. The
   * lengths correspond to the offsets. In other words, for a given expression, if the offset of that
   * expression is offsets[i], then the length of that expression is lengths[i].
   */
  private final int[] lengths;

  /**
   * Constructor for {@link ExtractLocalVariableFeedback}.
   */
  public ExtractLocalVariableFeedback(int[] coveringExpressionOffsets, int[] coveringExpressionLengths, List<String> names, int[] offsets, int[] lengths) {
    this.coveringExpressionOffsets = coveringExpressionOffsets;
    this.coveringExpressionLengths = coveringExpressionLengths;
    this.names = names;
    this.offsets = offsets;
    this.lengths = lengths;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof ExtractLocalVariableFeedback other) {
      return
        Arrays.equals(other.coveringExpressionOffsets, coveringExpressionOffsets) &&
        Arrays.equals(other.coveringExpressionLengths, coveringExpressionLengths) &&
        Objects.equals(other.names, names) &&
        Arrays.equals(other.offsets, offsets) &&
        Arrays.equals(other.lengths, lengths);
    }
    return false;
  }

  public static ExtractLocalVariableFeedback fromJson(JsonObject jsonObject) {
    int[] coveringExpressionOffsets = jsonObject.get("coveringExpressionOffsets") == null ? null : JsonUtilities.decodeIntArray(jsonObject.get("coveringExpressionOffsets").getAsJsonArray());
    int[] coveringExpressionLengths = jsonObject.get("coveringExpressionLengths") == null ? null : JsonUtilities.decodeIntArray(jsonObject.get("coveringExpressionLengths").getAsJsonArray());
    List<String> names = JsonUtilities.decodeStringList(jsonObject.get("names").getAsJsonArray());
    int[] offsets = JsonUtilities.decodeIntArray(jsonObject.get("offsets").getAsJsonArray());
    int[] lengths = JsonUtilities.decodeIntArray(jsonObject.get("lengths").getAsJsonArray());
    return new ExtractLocalVariableFeedback(coveringExpressionOffsets, coveringExpressionLengths, names, offsets, lengths);
  }

  public static List<ExtractLocalVariableFeedback> fromJsonArray(JsonArray jsonArray) {
    if (jsonArray == null) {
      return EMPTY_LIST;
    }
    List<ExtractLocalVariableFeedback> list = new ArrayList<>(jsonArray.size());
    for (final JsonElement element : jsonArray) {
      list.add(fromJson(element.getAsJsonObject()));
    }
    return list;
  }

  /**
   * The lengths of the expressions that cover the specified selection, from the down most to the up
   * most.
   */
  public int[] getCoveringExpressionLengths() {
    return coveringExpressionLengths;
  }

  /**
   * The offsets of the expressions that cover the specified selection, from the down most to the up
   * most.
   */
  public int[] getCoveringExpressionOffsets() {
    return coveringExpressionOffsets;
  }

  /**
   * The lengths of the expressions that would be replaced by a reference to the variable. The
   * lengths correspond to the offsets. In other words, for a given expression, if the offset of that
   * expression is offsets[i], then the length of that expression is lengths[i].
   */
  public int[] getLengths() {
    return lengths;
  }

  /**
   * The proposed names for the local variable.
   */
  public List<String> getNames() {
    return names;
  }

  /**
   * The offsets of the expressions that would be replaced by a reference to the variable.
   */
  public int[] getOffsets() {
    return offsets;
  }

  @Override
  public int hashCode() {
    return Objects.hash(
      Arrays.hashCode(coveringExpressionOffsets),
      Arrays.hashCode(coveringExpressionLengths),
      names,
      Arrays.hashCode(offsets),
      Arrays.hashCode(lengths)
    );
  }

  @Override
  public JsonObject toJson() {
    JsonObject jsonObject = new JsonObject();
    if (coveringExpressionOffsets != null) {
      JsonArray jsonArrayCoveringExpressionOffsets = new JsonArray();
      for (int elt : coveringExpressionOffsets) {
        jsonArrayCoveringExpressionOffsets.add(new JsonPrimitive(elt));
      }
      jsonObject.add("coveringExpressionOffsets", jsonArrayCoveringExpressionOffsets);
    }
    if (coveringExpressionLengths != null) {
      JsonArray jsonArrayCoveringExpressionLengths = new JsonArray();
      for (int elt : coveringExpressionLengths) {
        jsonArrayCoveringExpressionLengths.add(new JsonPrimitive(elt));
      }
      jsonObject.add("coveringExpressionLengths", jsonArrayCoveringExpressionLengths);
    }
    JsonArray jsonArrayNames = new JsonArray();
    for (String elt : names) {
      jsonArrayNames.add(new JsonPrimitive(elt));
    }
    jsonObject.add("names", jsonArrayNames);
    JsonArray jsonArrayOffsets = new JsonArray();
    for (int elt : offsets) {
      jsonArrayOffsets.add(new JsonPrimitive(elt));
    }
    jsonObject.add("offsets", jsonArrayOffsets);
    JsonArray jsonArrayLengths = new JsonArray();
    for (int elt : lengths) {
      jsonArrayLengths.add(new JsonPrimitive(elt));
    }
    jsonObject.add("lengths", jsonArrayLengths);
    return jsonObject;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[");
    builder.append("coveringExpressionOffsets=");
    builder.append(coveringExpressionOffsets == null ? "null" : Arrays.stream(coveringExpressionOffsets).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
    builder.append(", ");
    builder.append("coveringExpressionLengths=");
    builder.append(coveringExpressionLengths == null ? "null" : Arrays.stream(coveringExpressionLengths).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
    builder.append(", ");
    builder.append("names=");
    builder.append(names.stream().map(String::valueOf).collect(Collectors.joining(", ")));
    builder.append(", ");
    builder.append("offsets=");
    builder.append(Arrays.stream(offsets).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
    builder.append(", ");
    builder.append("lengths=");
    builder.append(Arrays.stream(lengths).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
    builder.append("]");
    return builder.toString();
  }

}

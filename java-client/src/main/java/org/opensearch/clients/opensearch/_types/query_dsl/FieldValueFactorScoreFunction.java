/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package org.opensearch.clients.opensearch._types.query_dsl;

import org.opensearch.clients.json.JsonpDeserializable;
import org.opensearch.clients.json.JsonpDeserializer;
import org.opensearch.clients.json.JsonpMapper;
import org.opensearch.clients.json.ObjectBuilderDeserializer;
import org.opensearch.clients.json.ObjectDeserializer;
import org.opensearch.clients.util.ApiTypeHelper;
import org.opensearch.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.query_dsl.FieldValueFactorScoreFunction

/**
 *
 * @see <a href=
 *      "https://github.com/elastic/elasticsearch-specification/tree/98036c3/specification/_types/query_dsl/compound.ts#L77-L82">API
 *      specification</a>
 */
@JsonpDeserializable
public class FieldValueFactorScoreFunction extends ScoreFunctionBase implements FunctionScoreVariant {
	private final String field;

	@Nullable
	private final Double factor;

	@Nullable
	private final Double missing;

	@Nullable
	private final FieldValueFactorModifier modifier;

	// ---------------------------------------------------------------------------------------------

	private FieldValueFactorScoreFunction(Builder builder) {
		super(builder);

		this.field = ApiTypeHelper.requireNonNull(builder.field, this, "field");
		this.factor = builder.factor;
		this.missing = builder.missing;
		this.modifier = builder.modifier;

	}

	public static FieldValueFactorScoreFunction of(Function<Builder, ObjectBuilder<FieldValueFactorScoreFunction>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * FunctionScore variant kind.
	 */
	@Override
	public FunctionScore.Kind _functionScoreKind() {
		return FunctionScore.Kind.FieldValueFactor;
	}

	/**
	 * Required - API name: {@code field}
	 */
	public final String field() {
		return this.field;
	}

	/**
	 * API name: {@code factor}
	 */
	@Nullable
	public final Double factor() {
		return this.factor;
	}

	/**
	 * API name: {@code missing}
	 */
	@Nullable
	public final Double missing() {
		return this.missing;
	}

	/**
	 * API name: {@code modifier}
	 */
	@Nullable
	public final FieldValueFactorModifier modifier() {
		return this.modifier;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		super.serializeInternal(generator, mapper);
		generator.writeKey("field");
		generator.write(this.field);

		if (this.factor != null) {
			generator.writeKey("factor");
			generator.write(this.factor);

		}
		if (this.missing != null) {
			generator.writeKey("missing");
			generator.write(this.missing);

		}
		if (this.modifier != null) {
			generator.writeKey("modifier");
			this.modifier.serialize(generator, mapper);
		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link FieldValueFactorScoreFunction}.
	 */

	public static class Builder extends ScoreFunctionBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<FieldValueFactorScoreFunction> {
		private String field;

		@Nullable
		private Double factor;

		@Nullable
		private Double missing;

		@Nullable
		private FieldValueFactorModifier modifier;

		/**
		 * Required - API name: {@code field}
		 */
		public final Builder field(String value) {
			this.field = value;
			return this;
		}

		/**
		 * API name: {@code factor}
		 */
		public final Builder factor(@Nullable Double value) {
			this.factor = value;
			return this;
		}

		/**
		 * API name: {@code missing}
		 */
		public final Builder missing(@Nullable Double value) {
			this.missing = value;
			return this;
		}

		/**
		 * API name: {@code modifier}
		 */
		public final Builder modifier(@Nullable FieldValueFactorModifier value) {
			this.modifier = value;
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link FieldValueFactorScoreFunction}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public FieldValueFactorScoreFunction build() {
			_checkSingleUse();

			return new FieldValueFactorScoreFunction(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link FieldValueFactorScoreFunction}
	 */
	public static final JsonpDeserializer<FieldValueFactorScoreFunction> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, FieldValueFactorScoreFunction::setupFieldValueFactorScoreFunctionDeserializer);

	protected static void setupFieldValueFactorScoreFunctionDeserializer(
			ObjectDeserializer<FieldValueFactorScoreFunction.Builder> op) {
		ScoreFunctionBase.setupScoreFunctionBaseDeserializer(op);
		op.add(Builder::field, JsonpDeserializer.stringDeserializer(), "field");
		op.add(Builder::factor, JsonpDeserializer.doubleDeserializer(), "factor");
		op.add(Builder::missing, JsonpDeserializer.doubleDeserializer(), "missing");
		op.add(Builder::modifier, FieldValueFactorModifier._DESERIALIZER, "modifier");

	}

}
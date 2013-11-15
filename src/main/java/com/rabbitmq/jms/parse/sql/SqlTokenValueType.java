/**
 *
 */
package com.rabbitmq.jms.parse.sql;

/**
 * The types of the values associated with {@link SqlToken}s.
 * <p>
 * Each token can have an associated {@link String} which is interpreted according to the {@link SqlTokenValueType} term
 * associated with its {@link SqlTokenType}.
 * </p>
 * <p>
 * The NO_VALUE value indicates that there is no String associated with the token (it is a literal term standing for
 * itself, for example the left parenthesis <code>(</code>, or the keyword <code>NOT</code>.
 * </p>
 *
 * @author spowell pp GoPivotal Inc.
 */
enum SqlTokenValueType {
    NO_VALUE,
    STRING,
    IDENT,
    LONG,
    HEX,
    FLOAT,
    LIST,
    ;
}

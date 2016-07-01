/*
 * See provided LICENCE.txt in the project root.
 * Licenced to Minecraftly under GNU-GPLv3.
 */

package com.minecraftly.core.util;

/**
 * @author Cory Redmond <ace@ac3-servers.eu>
 */
public interface Callback<R, P> {

	R call( P param );

}
/*
 * Copyright (C) 2017-2020 Sebastiano Vigna
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package it.unimi.dsi.fastutil.doubles;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import it.unimi.dsi.fastutil.MainRunner;

public class DoubleOpenHashSetTest {

	@Test
	public void testNaNs() {
		final DoubleOpenHashSet s = new DoubleOpenHashSet();
		s.add(Double.NaN);
		s.add(Double.NaN);
		assertEquals(1, s.size());
	}

	@Test
	public void testZeros() {
		final DoubleOpenHashSet s = new DoubleOpenHashSet();
		assertTrue(s.add(-0.0d));
		assertTrue(s.add(+0.0d));
		assertEquals(2, s.size());
	}

	@Test
	public void testLegacyMainMethodTests() throws Exception {
		MainRunner.callMainIfExists(DoubleOpenHashSet.class, "test", /*num=*/"500", /*loadFactor=*/"0.75", /*seed=*/"3838474");
	}
}

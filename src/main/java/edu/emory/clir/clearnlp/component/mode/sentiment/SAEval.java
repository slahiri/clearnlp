/**
 * Copyright 2014, Emory University
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
package edu.emory.clir.clearnlp.component.mode.sentiment;

import edu.emory.clir.clearnlp.component.evaluation.AbstractAccuracyEval;
import edu.emory.clir.clearnlp.dependency.DEPLib;
import edu.emory.clir.clearnlp.dependency.DEPNode;
import edu.emory.clir.clearnlp.dependency.DEPTree;

/**
 * @since 3.0.0
 * @author Jinho D. Choi ({@code jinho.choi@emory.edu})
 */
public class SAEval extends AbstractAccuracyEval<String>
{
	@Override
	public void countCorrect(DEPTree sTree, String[] gTags)
	{
		DEPNode root = sTree.get(DEPLib.ROOT_ID);
		
		if (gTags[0].equals(root.getFeat(DEPLib.FEAT_SA)))
			n_correct++;
		
		n_total++;
	}
}
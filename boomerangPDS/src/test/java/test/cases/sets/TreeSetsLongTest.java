package test.cases.sets;


import java.util.Set;
import java.util.TreeSet;

import org.junit.Ignore;
import org.junit.Test;

import test.cases.fields.Alloc;
import test.core.AbstractBoomerangTest;
import test.core.selfrunning.AllocatedObject;


@Ignore
public class TreeSetsLongTest extends AbstractBoomerangTest{
	@Test
	public void addAndRetrieve(){
		Set<Object> set = new TreeSet<Object>();
		Alloc alias = new Alloc();
		set.add(alias);
//		alias = new Alloc();
//		set.add(alias);
//		alias = new Alloc();
//		set.add(alias);
//		alias = new Alloc();
//		set.add(alias);
//		alias = new Alloc();
//		set.add(alias);
		
		Object alias2 = null;
		for(Object o : set)
			alias2 = o;
		Object ir = alias2;
		Object query2 = ir;
		queryFor(query2);
	}
	
	@Override
	protected boolean includeJDK() {
		return true;
	}
}

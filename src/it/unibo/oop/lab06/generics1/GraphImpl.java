package it.unibo.oop.lab06.generics1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class GraphImpl<N> implements Graph<N> {
	
	private Set<N> nodes;
	private Map<N, List<N>> edges;
	
	public GraphImpl() {
		nodes = new HashSet<>();
		edges = new HashMap<>();
	}
    
	@Override
	public void addNode(N node) {
		this.nodes.add(node);
	}

	@Override
	public void addEdge(N source, N target) {
		if (this.nodes.contains(source)&&this.nodes.contains(target)) {
			this.edges.get(source).add(target);
			
		}
	}

	@Override
	public Set<N> nodeSet() {
		return this.nodes;
	}

	@Override
	public Set<N> linkedNodes(N node) {
		return (Set<N>) edges.get(node);
	}

	@Override
	public List<N> getPath(N source, N target) {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<N, List<N>> getEdges() {
		return edges;
	}

}

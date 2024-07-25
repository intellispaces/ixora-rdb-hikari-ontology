package intellispaces.ixora.mindstructs.rdb.hikary;

import tech.intellispaces.framework.core.annotation.Domain;
import tech.intellispaces.framework.core.annotation.Transition;
import tech.intellispaces.framework.core.traverse.TraverseTypes;

@Domain("7aae1f0c-1d54-43a3-a9f8-fc32bbb6891e")
public interface HikariDataSourceFactory {

  @Transition(value = "16b62a7e-4c8c-4d41-bd44-36581db13589", allowedTraverseTypes = TraverseTypes.Moving, isFactory = true)
  HikariDataSource create(HikariDataSourceProperties properties);
}

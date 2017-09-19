// GENERATED BY S3LM4
package io.crpdevs.demo.rs.mapper.root;


@org.springframework.stereotype.Service("")
public final class RootResourceMapperSelmaGeneratedClass
    implements RootResourceMapper {

  @Override
  public final io.crpdevs.demo.rs.representation.root.RootResourceOutput mapEntityTo(io.crpdevs.demo.rs.persistence.entity.root.RootResource inRootResource) {
    io.crpdevs.demo.rs.representation.root.RootResourceOutput out = null;
    if (inRootResource != null) {
      out = new io.crpdevs.demo.rs.representation.root.RootResourceOutput();
      out.setId(inRootResource.getId());
      out.setName(inRootResource.getName());
    }
    return out;
  }


  @Override
  public final io.crpdevs.demo.rs.persistence.entity.root.RootResource mergeEntities(io.crpdevs.demo.rs.persistence.entity.root.RootResource inRootResource, io.crpdevs.demo.rs.persistence.entity.root.RootResource out) {
    if (inRootResource != null) {
      if (out == null) {
        out = new io.crpdevs.demo.rs.persistence.entity.root.RootResource();
      }
      out.setName(inRootResource.getName());
    }
    if (fr.xebia.extras.selma.SelmaUtils.areNull(inRootResource)) {
      out = null;
    }
    return out;
  }


  @Override
  public final java.util.List<io.crpdevs.demo.rs.representation.root.RootResourceOutput> mapEntitiesTo(java.util.List<io.crpdevs.demo.rs.persistence.entity.root.RootResource> inRootResource) {
    java.util.List<io.crpdevs.demo.rs.representation.root.RootResourceOutput> out = null;
    if (inRootResource != null) {
      java.util.ArrayList<io.crpdevs.demo.rs.representation.root.RootResourceOutput> aoutTmpCollection = new java.util.ArrayList<io.crpdevs.demo.rs.representation.root.RootResourceOutput>(inRootResource.size());
      for (io.crpdevs.demo.rs.persistence.entity.root.RootResource aoutItem : inRootResource) {
        aoutTmpCollection.add(mapEntityTo(aoutItem));
      }
      out = aoutTmpCollection;
    }
    return out;
  }


  @Override
  public final io.crpdevs.demo.rs.persistence.entity.root.RootResource mapRepresentationTo(io.crpdevs.demo.rs.representation.root.RootResourceInput inRootResourceInput) {
    io.crpdevs.demo.rs.persistence.entity.root.RootResource out = null;
    if (inRootResourceInput != null) {
      out = new io.crpdevs.demo.rs.persistence.entity.root.RootResource();
      out.setName(inRootResourceInput.getName());
    }
    return out;
  }



  /**
   * Single constructor
   */
  public RootResourceMapperSelmaGeneratedClass() {
  }

}
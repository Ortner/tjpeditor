/**
 * <copyright>
 * </copyright>
 *
 */
package org.jjflyboy.tjpeditor.project;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Purge Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.jjflyboy.tjpeditor.project.PurgeTask#getListAttribute <em>List Attribute</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getPurgeTask()
 * @model
 * @generated
 */
public interface PurgeTask extends TaskAttribute
{
  /**
   * Returns the value of the '<em><b>List Attribute</b></em>' attribute.
   * The literals are from the enumeration {@link org.jjflyboy.tjpeditor.project.PurgeTaskAttribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List Attribute</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List Attribute</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.PurgeTaskAttribute
   * @see #setListAttribute(PurgeTaskAttribute)
   * @see org.jjflyboy.tjpeditor.project.ProjectPackage#getPurgeTask_ListAttribute()
   * @model
   * @generated
   */
  PurgeTaskAttribute getListAttribute();

  /**
   * Sets the value of the '{@link org.jjflyboy.tjpeditor.project.PurgeTask#getListAttribute <em>List Attribute</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List Attribute</em>' attribute.
   * @see org.jjflyboy.tjpeditor.project.PurgeTaskAttribute
   * @see #getListAttribute()
   * @generated
   */
  void setListAttribute(PurgeTaskAttribute value);

} // PurgeTask
